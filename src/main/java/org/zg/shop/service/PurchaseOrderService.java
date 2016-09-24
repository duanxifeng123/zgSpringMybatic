package org.zg.shop.service;

import org.zg.shop.model.PurchaseOrder;

import java.util.List;

/**
 * Created by duanxifeng on 2016-8-14.
 */
public interface PurchaseOrderService {

    List<PurchaseOrder> GetPurchaseOrderAll(Integer page,Integer rows);
}
