package org.zg.shop.dao;

import org.apache.ibatis.annotations.Param;
import org.zg.shop.model.PurchaseOrder;
import org.zg.shop.model.PurchaseOrderExample;

import java.util.List;

public interface PurchaseOrderMapper {

    int countByExample(PurchaseOrderExample example);

    int deleteByExample(PurchaseOrderExample example);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    List<PurchaseOrder> selectByExample(PurchaseOrderExample example);

    int updateByExampleSelective(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    int updateByExample(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    List<PurchaseOrder> GetPurchaseOrderAll(Integer page,Integer rows);
}