package com.yshop.service.product.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yshop.service.product.common.pojo.TaotaoResult;
import com.yshop.service.product.common.utils.HttpClientUtil;
import com.yshop.service.product.mapper.TbContentMapper;
import com.yshop.service.product.pojo.TbContent;
import com.yshop.service.product.service.ContentService;

/**
 * 内容管理
 */
@Service
public class ContentServiceImpl implements ContentService {
    private static Logger logger = LoggerFactory.getLogger(ContentServiceImpl.class);

    @Autowired
    private TbContentMapper contentMapper;
    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${REST_CONTENT_SYNC_URL}")
    private String REST_CONTENT_SYNC_URL;


    @Override
    public TaotaoResult insertContent(TbContent content) {
        //补全pojo内容
        content.setCreated(new Date());
        content.setUpdated(new Date());
        contentMapper.insert(content);

        //添加缓存同步逻辑
        try {
            HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + content.getCategoryId());
        } catch (Exception e) {
            logger.error("insert content error!", e);
        }
        return TaotaoResult.ok();
    }

}
