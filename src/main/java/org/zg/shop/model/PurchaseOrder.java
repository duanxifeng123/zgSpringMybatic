package org.zg.shop.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrder {
    private Long pkid;

    private String purchaseOrderCode;

    private Long investorId;

    private Long investorType;

    private BigDecimal purchaseTotalAmount;

    private BigDecimal purchaseTotalWeight;

    private Long deliveryStatus;

    private Long buyerId;

    private Long departmentId;

    private Long branchCompanyId;

    private Long areaId;

    private Date orderDate;

    private Long addedBy;

    private Date addedTime;

    private Long lastModifiedBy;

    private Date lastModifiedTime;

    private String lastModifiedIp;

    private String valid;

    private Date planInDate;

    private Long orgTitleId;

    private String contractCode;

    private Long contractId;

    private Long recipient;

    private Long categoryId;

    private Long purchaseAreaId;

    private Long goodType;

    private Long financeCompanyId;

    private String financeCompanyAbbreviation;

    private Long businessType;

    private Long paymentStatus;

    private String investorName;

    private String addedName;

    private String supplierIdList;

    private String supplierNameList;

    private String factoryIdList;

    private String factoryNameList;

    private String productLineName;

    private String positionIdList;

    private String positionNameList;

    private String departmentName;

    private Long deliveryOwnerType;

    private String deliveryOwnerName;

    private Long deliveryOwnerId;

    private String financeApplyCode;

    private Long purchaseChannelType;

    private BigDecimal paymentAmount;

    private Long purchaseTotalQuantity;

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    public void setPurchaseOrderCode(String purchaseOrderCode) {
        this.purchaseOrderCode = purchaseOrderCode == null ? null : purchaseOrderCode.trim();
    }

    public Long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Long investorId) {
        this.investorId = investorId;
    }

    public Long getInvestorType() {
        return investorType;
    }

    public void setInvestorType(Long investorType) {
        this.investorType = investorType;
    }

    public BigDecimal getPurchaseTotalAmount() {
        return purchaseTotalAmount;
    }

    public void setPurchaseTotalAmount(BigDecimal purchaseTotalAmount) {
        this.purchaseTotalAmount = purchaseTotalAmount;
    }

    public BigDecimal getPurchaseTotalWeight() {
        return purchaseTotalWeight;
    }

    public void setPurchaseTotalWeight(BigDecimal purchaseTotalWeight) {
        this.purchaseTotalWeight = purchaseTotalWeight;
    }

    public Long getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Long deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getBranchCompanyId() {
        return branchCompanyId;
    }

    public void setBranchCompanyId(Long branchCompanyId) {
        this.branchCompanyId = branchCompanyId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Long addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getLastModifiedIp() {
        return lastModifiedIp;
    }

    public void setLastModifiedIp(String lastModifiedIp) {
        this.lastModifiedIp = lastModifiedIp == null ? null : lastModifiedIp.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    public Date getPlanInDate() {
        return planInDate;
    }

    public void setPlanInDate(Date planInDate) {
        this.planInDate = planInDate;
    }

    public Long getOrgTitleId() {
        return orgTitleId;
    }

    public void setOrgTitleId(Long orgTitleId) {
        this.orgTitleId = orgTitleId;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode == null ? null : contractCode.trim();
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getRecipient() {
        return recipient;
    }

    public void setRecipient(Long recipient) {
        this.recipient = recipient;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getPurchaseAreaId() {
        return purchaseAreaId;
    }

    public void setPurchaseAreaId(Long purchaseAreaId) {
        this.purchaseAreaId = purchaseAreaId;
    }

    public Long getGoodType() {
        return goodType;
    }

    public void setGoodType(Long goodType) {
        this.goodType = goodType;
    }

    public Long getFinanceCompanyId() {
        return financeCompanyId;
    }

    public void setFinanceCompanyId(Long financeCompanyId) {
        this.financeCompanyId = financeCompanyId;
    }

    public String getFinanceCompanyAbbreviation() {
        return financeCompanyAbbreviation;
    }

    public void setFinanceCompanyAbbreviation(String financeCompanyAbbreviation) {
        this.financeCompanyAbbreviation = financeCompanyAbbreviation == null ? null : financeCompanyAbbreviation.trim();
    }

    public Long getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Long businessType) {
        this.businessType = businessType;
    }

    public Long getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Long paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName == null ? null : investorName.trim();
    }

    public String getAddedName() {
        return addedName;
    }

    public void setAddedName(String addedName) {
        this.addedName = addedName == null ? null : addedName.trim();
    }

    public String getSupplierIdList() {
        return supplierIdList;
    }

    public void setSupplierIdList(String supplierIdList) {
        this.supplierIdList = supplierIdList == null ? null : supplierIdList.trim();
    }

    public String getSupplierNameList() {
        return supplierNameList;
    }

    public void setSupplierNameList(String supplierNameList) {
        this.supplierNameList = supplierNameList == null ? null : supplierNameList.trim();
    }

    public String getFactoryIdList() {
        return factoryIdList;
    }

    public void setFactoryIdList(String factoryIdList) {
        this.factoryIdList = factoryIdList == null ? null : factoryIdList.trim();
    }

    public String getFactoryNameList() {
        return factoryNameList;
    }

    public void setFactoryNameList(String factoryNameList) {
        this.factoryNameList = factoryNameList == null ? null : factoryNameList.trim();
    }

    public String getProductLineName() {
        return productLineName;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName == null ? null : productLineName.trim();
    }

    public String getPositionIdList() {
        return positionIdList;
    }

    public void setPositionIdList(String positionIdList) {
        this.positionIdList = positionIdList == null ? null : positionIdList.trim();
    }

    public String getPositionNameList() {
        return positionNameList;
    }

    public void setPositionNameList(String positionNameList) {
        this.positionNameList = positionNameList == null ? null : positionNameList.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Long getDeliveryOwnerType() {
        return deliveryOwnerType;
    }

    public void setDeliveryOwnerType(Long deliveryOwnerType) {
        this.deliveryOwnerType = deliveryOwnerType;
    }

    public String getDeliveryOwnerName() {
        return deliveryOwnerName;
    }

    public void setDeliveryOwnerName(String deliveryOwnerName) {
        this.deliveryOwnerName = deliveryOwnerName == null ? null : deliveryOwnerName.trim();
    }

    public Long getDeliveryOwnerId() {
        return deliveryOwnerId;
    }

    public void setDeliveryOwnerId(Long deliveryOwnerId) {
        this.deliveryOwnerId = deliveryOwnerId;
    }

    public String getFinanceApplyCode() {
        return financeApplyCode;
    }

    public void setFinanceApplyCode(String financeApplyCode) {
        this.financeApplyCode = financeApplyCode == null ? null : financeApplyCode.trim();
    }

    public Long getPurchaseChannelType() {
        return purchaseChannelType;
    }

    public void setPurchaseChannelType(Long purchaseChannelType) {
        this.purchaseChannelType = purchaseChannelType;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Long getPurchaseTotalQuantity() {
        return purchaseTotalQuantity;
    }

    public void setPurchaseTotalQuantity(Long purchaseTotalQuantity) {
        this.purchaseTotalQuantity = purchaseTotalQuantity;
    }
}