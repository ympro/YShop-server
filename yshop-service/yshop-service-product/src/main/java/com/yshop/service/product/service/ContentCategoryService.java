package com.yshop.service.product.service;

import java.util.List;

import com.yshop.service.product.common.pojo.EUTreeNode;
import com.yshop.service.product.common.pojo.TaotaoResult;

public interface ContentCategoryService {

    List<EUTreeNode> getCategoryList(long parentId);

    TaotaoResult insertContentCategory(long parentId, String name);
}
