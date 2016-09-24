package org.zg.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.zg.shop.dao.PurchaseOrderMapper;
import org.zg.shop.model.PurchaseOrder;
import org.zg.shop.service.PurchaseOrderService;

import java.util.List;

/**
 * Created by duanxifeng on 2016-8-14.
 */

@Service("purchaseOrderService")
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @Override
    public List<PurchaseOrder> GetPurchaseOrderAll(Integer page,Integer rows) {
        return purchaseOrderMapper.GetPurchaseOrderAll(page,rows);
    }
}