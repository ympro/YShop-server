package com.yshop.service.product.service;

import com.yshop.service.product.common.pojo.EUDataGridResult;
import com.yshop.service.product.common.pojo.TaotaoResult;
import com.yshop.service.product.pojo.TbItem;

public interface ItemService {

    TbItem getItemById(long itemId);

    EUDataGridResult getItemList(int page, int rows);

    TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
