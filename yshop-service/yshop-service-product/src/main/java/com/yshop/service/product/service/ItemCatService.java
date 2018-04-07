package com.yshop.service.product.service;

import java.util.List;

import com.yshop.service.product.common.pojo.EUTreeNode;

public interface ItemCatService {

    List<EUTreeNode> getCatList(long parentId);
}
