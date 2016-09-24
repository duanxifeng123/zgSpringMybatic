package org.zg.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zg.shop.service.PurchaseOrderService;

/**
 * Created by duanxifeng on 2016-8-13.
 */

@Controller
@RequestMapping("/purchaseOrder")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;


    @RequestMapping("/showPurchaseOrder")
    public String ShowPurchaseOrder()
    {
        return "/purchaseOrder/showPurchaseOrder";
    }

    @RequestMapping("/GetPurchaseOrderAll")
    public @ResponseBody Object GetPurchaseOrderAll(Integer page,Integer rows)
    {
        return purchaseOrderService.GetPurchaseOrderAll(page,rows);
    }
}
