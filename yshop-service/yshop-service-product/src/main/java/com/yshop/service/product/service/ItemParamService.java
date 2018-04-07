package com.yshop.service.product.service;

import com.yshop.service.product.common.pojo.TaotaoResult;
import com.yshop.service.product.pojo.TbItemParam;

public interface ItemParamService {

    TaotaoResult getItemParamByCid(long cid);

    TaotaoResult insertItemParam(TbItemParam itemParam);
}
