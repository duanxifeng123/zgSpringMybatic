package org.zg.shop.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkidIsNull() {
            addCriterion("PKID is null");
            return (Criteria) this;
        }

        public Criteria andPkidIsNotNull() {
            addCriterion("PKID is not null");
            return (Criteria) this;
        }

        public Criteria andPkidEqualTo(Long value) {
            addCriterion("PKID =", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotEqualTo(Long value) {
            addCriterion("PKID <>", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThan(Long value) {
            addCriterion("PKID >", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThanOrEqualTo(Long value) {
            addCriterion("PKID >=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThan(Long value) {
            addCriterion("PKID <", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThanOrEqualTo(Long value) {
            addCriterion("PKID <=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidIn(List<Long> values) {
            addCriterion("PKID in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotIn(List<Long> values) {
            addCriterion("PKID not in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidBetween(Long value1, Long value2) {
            addCriterion("PKID between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotBetween(Long value1, Long value2) {
            addCriterion("PKID not between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeIsNull() {
            addCriterion("PURCHASE_ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeIsNotNull() {
            addCriterion("PURCHASE_ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_CODE =", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeNotEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_CODE <>", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeGreaterThan(String value) {
            addCriterion("PURCHASE_ORDER_CODE >", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_CODE >=", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeLessThan(String value) {
            addCriterion("PURCHASE_ORDER_CODE <", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_CODE <=", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeLike(String value) {
            addCriterion("PURCHASE_ORDER_CODE like", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeNotLike(String value) {
            addCriterion("PURCHASE_ORDER_CODE not like", value, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeIn(List<String> values) {
            addCriterion("PURCHASE_ORDER_CODE in", values, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeNotIn(List<String> values) {
            addCriterion("PURCHASE_ORDER_CODE not in", values, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeBetween(String value1, String value2) {
            addCriterion("PURCHASE_ORDER_CODE between", value1, value2, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderCodeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ORDER_CODE not between", value1, value2, "purchaseOrderCode");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIsNull() {
            addCriterion("INVESTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIsNotNull() {
            addCriterion("INVESTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorIdEqualTo(Long value) {
            addCriterion("INVESTOR_ID =", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotEqualTo(Long value) {
            addCriterion("INVESTOR_ID <>", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdGreaterThan(Long value) {
            addCriterion("INVESTOR_ID >", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INVESTOR_ID >=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLessThan(Long value) {
            addCriterion("INVESTOR_ID <", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLessThanOrEqualTo(Long value) {
            addCriterion("INVESTOR_ID <=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIn(List<Long> values) {
            addCriterion("INVESTOR_ID in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotIn(List<Long> values) {
            addCriterion("INVESTOR_ID not in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdBetween(Long value1, Long value2) {
            addCriterion("INVESTOR_ID between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotBetween(Long value1, Long value2) {
            addCriterion("INVESTOR_ID not between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIsNull() {
            addCriterion("INVESTOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIsNotNull() {
            addCriterion("INVESTOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeEqualTo(Long value) {
            addCriterion("INVESTOR_TYPE =", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotEqualTo(Long value) {
            addCriterion("INVESTOR_TYPE <>", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeGreaterThan(Long value) {
            addCriterion("INVESTOR_TYPE >", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("INVESTOR_TYPE >=", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLessThan(Long value) {
            addCriterion("INVESTOR_TYPE <", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLessThanOrEqualTo(Long value) {
            addCriterion("INVESTOR_TYPE <=", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIn(List<Long> values) {
            addCriterion("INVESTOR_TYPE in", values, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotIn(List<Long> values) {
            addCriterion("INVESTOR_TYPE not in", values, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeBetween(Long value1, Long value2) {
            addCriterion("INVESTOR_TYPE between", value1, value2, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotBetween(Long value1, Long value2) {
            addCriterion("INVESTOR_TYPE not between", value1, value2, "investorType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountIsNull() {
            addCriterion("PURCHASE_TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountIsNotNull() {
            addCriterion("PURCHASE_TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_AMOUNT =", value, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_AMOUNT <>", value, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_AMOUNT >", value, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_AMOUNT >=", value, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountLessThan(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_AMOUNT <", value, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_AMOUNT <=", value, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_TOTAL_AMOUNT in", values, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_TOTAL_AMOUNT not in", values, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_TOTAL_AMOUNT between", value1, value2, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_TOTAL_AMOUNT not between", value1, value2, "purchaseTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightIsNull() {
            addCriterion("PURCHASE_TOTAL_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightIsNotNull() {
            addCriterion("PURCHASE_TOTAL_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_WEIGHT =", value, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_WEIGHT <>", value, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_WEIGHT >", value, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_WEIGHT >=", value, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightLessThan(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_WEIGHT <", value, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_TOTAL_WEIGHT <=", value, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_TOTAL_WEIGHT in", values, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_TOTAL_WEIGHT not in", values, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_TOTAL_WEIGHT between", value1, value2, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_TOTAL_WEIGHT not between", value1, value2, "purchaseTotalWeight");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNull() {
            addCriterion("DELIVERY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNotNull() {
            addCriterion("DELIVERY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusEqualTo(Long value) {
            addCriterion("DELIVERY_STATUS =", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotEqualTo(Long value) {
            addCriterion("DELIVERY_STATUS <>", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThan(Long value) {
            addCriterion("DELIVERY_STATUS >", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_STATUS >=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThan(Long value) {
            addCriterion("DELIVERY_STATUS <", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_STATUS <=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIn(List<Long> values) {
            addCriterion("DELIVERY_STATUS in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotIn(List<Long> values) {
            addCriterion("DELIVERY_STATUS not in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_STATUS between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_STATUS not between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("BUYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("BUYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("BUYER_ID =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("BUYER_ID in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("BUYER_ID not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("BUYER_ID between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("BUYER_ID not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdIsNull() {
            addCriterion("BRANCH_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdIsNotNull() {
            addCriterion("BRANCH_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdEqualTo(Long value) {
            addCriterion("BRANCH_COMPANY_ID =", value, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdNotEqualTo(Long value) {
            addCriterion("BRANCH_COMPANY_ID <>", value, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdGreaterThan(Long value) {
            addCriterion("BRANCH_COMPANY_ID >", value, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BRANCH_COMPANY_ID >=", value, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdLessThan(Long value) {
            addCriterion("BRANCH_COMPANY_ID <", value, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("BRANCH_COMPANY_ID <=", value, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdIn(List<Long> values) {
            addCriterion("BRANCH_COMPANY_ID in", values, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdNotIn(List<Long> values) {
            addCriterion("BRANCH_COMPANY_ID not in", values, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdBetween(Long value1, Long value2) {
            addCriterion("BRANCH_COMPANY_ID between", value1, value2, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andBranchCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("BRANCH_COMPANY_ID not between", value1, value2, "branchCompanyId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("ORDER_DATE =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("ORDER_DATE <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("ORDER_DATE >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_DATE >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("ORDER_DATE <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_DATE <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("ORDER_DATE in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("ORDER_DATE not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("ORDER_DATE between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_DATE not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andAddedByIsNull() {
            addCriterion("ADDED_BY is null");
            return (Criteria) this;
        }

        public Criteria andAddedByIsNotNull() {
            addCriterion("ADDED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andAddedByEqualTo(Long value) {
            addCriterion("ADDED_BY =", value, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByNotEqualTo(Long value) {
            addCriterion("ADDED_BY <>", value, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByGreaterThan(Long value) {
            addCriterion("ADDED_BY >", value, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByGreaterThanOrEqualTo(Long value) {
            addCriterion("ADDED_BY >=", value, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByLessThan(Long value) {
            addCriterion("ADDED_BY <", value, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByLessThanOrEqualTo(Long value) {
            addCriterion("ADDED_BY <=", value, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByIn(List<Long> values) {
            addCriterion("ADDED_BY in", values, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByNotIn(List<Long> values) {
            addCriterion("ADDED_BY not in", values, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByBetween(Long value1, Long value2) {
            addCriterion("ADDED_BY between", value1, value2, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedByNotBetween(Long value1, Long value2) {
            addCriterion("ADDED_BY not between", value1, value2, "addedBy");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIsNull() {
            addCriterion("ADDED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIsNotNull() {
            addCriterion("ADDED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddedTimeEqualTo(Date value) {
            addCriterion("ADDED_TIME =", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotEqualTo(Date value) {
            addCriterion("ADDED_TIME <>", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeGreaterThan(Date value) {
            addCriterion("ADDED_TIME >", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADDED_TIME >=", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeLessThan(Date value) {
            addCriterion("ADDED_TIME <", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADDED_TIME <=", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIn(List<Date> values) {
            addCriterion("ADDED_TIME in", values, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotIn(List<Date> values) {
            addCriterion("ADDED_TIME not in", values, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeBetween(Date value1, Date value2) {
            addCriterion("ADDED_TIME between", value1, value2, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADDED_TIME not between", value1, value2, "addedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNull() {
            addCriterion("LAST_MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNotNull() {
            addCriterion("LAST_MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(Long value) {
            addCriterion("LAST_MODIFIED_BY >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(Long value) {
            addCriterion("LAST_MODIFIED_BY <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<Long> values) {
            addCriterion("LAST_MODIFIED_BY in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<Long> values) {
            addCriterion("LAST_MODIFIED_BY not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFIED_BY between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFIED_BY not between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("LAST_MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("LAST_MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_TIME >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("LAST_MODIFIED_TIME <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_TIME in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_TIME not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_TIME between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_TIME not between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpIsNull() {
            addCriterion("LAST_MODIFIED_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpIsNotNull() {
            addCriterion("LAST_MODIFIED_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpEqualTo(String value) {
            addCriterion("LAST_MODIFIED_IP =", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpNotEqualTo(String value) {
            addCriterion("LAST_MODIFIED_IP <>", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpGreaterThan(String value) {
            addCriterion("LAST_MODIFIED_IP >", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_IP >=", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpLessThan(String value) {
            addCriterion("LAST_MODIFIED_IP <", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_IP <=", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpLike(String value) {
            addCriterion("LAST_MODIFIED_IP like", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpNotLike(String value) {
            addCriterion("LAST_MODIFIED_IP not like", value, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpIn(List<String> values) {
            addCriterion("LAST_MODIFIED_IP in", values, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpNotIn(List<String> values) {
            addCriterion("LAST_MODIFIED_IP not in", values, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_IP between", value1, value2, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIpNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_IP not between", value1, value2, "lastModifiedIp");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("VALID like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("VALID not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andPlanInDateIsNull() {
            addCriterion("PLAN_IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanInDateIsNotNull() {
            addCriterion("PLAN_IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanInDateEqualTo(Date value) {
            addCriterion("PLAN_IN_DATE =", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateNotEqualTo(Date value) {
            addCriterion("PLAN_IN_DATE <>", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateGreaterThan(Date value) {
            addCriterion("PLAN_IN_DATE >", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_IN_DATE >=", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateLessThan(Date value) {
            addCriterion("PLAN_IN_DATE <", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_IN_DATE <=", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateIn(List<Date> values) {
            addCriterion("PLAN_IN_DATE in", values, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateNotIn(List<Date> values) {
            addCriterion("PLAN_IN_DATE not in", values, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_IN_DATE between", value1, value2, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_IN_DATE not between", value1, value2, "planInDate");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdIsNull() {
            addCriterion("ORG_TITLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdIsNotNull() {
            addCriterion("ORG_TITLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdEqualTo(Long value) {
            addCriterion("ORG_TITLE_ID =", value, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdNotEqualTo(Long value) {
            addCriterion("ORG_TITLE_ID <>", value, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdGreaterThan(Long value) {
            addCriterion("ORG_TITLE_ID >", value, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_TITLE_ID >=", value, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdLessThan(Long value) {
            addCriterion("ORG_TITLE_ID <", value, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_TITLE_ID <=", value, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdIn(List<Long> values) {
            addCriterion("ORG_TITLE_ID in", values, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdNotIn(List<Long> values) {
            addCriterion("ORG_TITLE_ID not in", values, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdBetween(Long value1, Long value2) {
            addCriterion("ORG_TITLE_ID between", value1, value2, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andOrgTitleIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_TITLE_ID not between", value1, value2, "orgTitleId");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("CONTRACT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("CONTRACT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("CONTRACT_CODE =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("CONTRACT_CODE <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("CONTRACT_CODE >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("CONTRACT_CODE <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("CONTRACT_CODE like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("CONTRACT_CODE not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("CONTRACT_CODE in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("CONTRACT_CODE not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Long value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Long value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Long value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Long value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Long> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Long> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("RECIPIENT is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("RECIPIENT is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(Long value) {
            addCriterion("RECIPIENT =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(Long value) {
            addCriterion("RECIPIENT <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(Long value) {
            addCriterion("RECIPIENT >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(Long value) {
            addCriterion("RECIPIENT >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(Long value) {
            addCriterion("RECIPIENT <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(Long value) {
            addCriterion("RECIPIENT <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<Long> values) {
            addCriterion("RECIPIENT in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<Long> values) {
            addCriterion("RECIPIENT not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(Long value1, Long value2) {
            addCriterion("RECIPIENT between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(Long value1, Long value2) {
            addCriterion("RECIPIENT not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdIsNull() {
            addCriterion("PURCHASE_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdIsNotNull() {
            addCriterion("PURCHASE_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdEqualTo(Long value) {
            addCriterion("PURCHASE_AREA_ID =", value, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdNotEqualTo(Long value) {
            addCriterion("PURCHASE_AREA_ID <>", value, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdGreaterThan(Long value) {
            addCriterion("PURCHASE_AREA_ID >", value, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_AREA_ID >=", value, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdLessThan(Long value) {
            addCriterion("PURCHASE_AREA_ID <", value, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_AREA_ID <=", value, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdIn(List<Long> values) {
            addCriterion("PURCHASE_AREA_ID in", values, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdNotIn(List<Long> values) {
            addCriterion("PURCHASE_AREA_ID not in", values, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_AREA_ID between", value1, value2, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_AREA_ID not between", value1, value2, "purchaseAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNull() {
            addCriterion("GOOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("GOOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(Long value) {
            addCriterion("GOOD_TYPE =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(Long value) {
            addCriterion("GOOD_TYPE <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(Long value) {
            addCriterion("GOOD_TYPE >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("GOOD_TYPE >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(Long value) {
            addCriterion("GOOD_TYPE <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(Long value) {
            addCriterion("GOOD_TYPE <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<Long> values) {
            addCriterion("GOOD_TYPE in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<Long> values) {
            addCriterion("GOOD_TYPE not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(Long value1, Long value2) {
            addCriterion("GOOD_TYPE between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(Long value1, Long value2) {
            addCriterion("GOOD_TYPE not between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdIsNull() {
            addCriterion("FINANCE_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdIsNotNull() {
            addCriterion("FINANCE_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdEqualTo(Long value) {
            addCriterion("FINANCE_COMPANY_ID =", value, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdNotEqualTo(Long value) {
            addCriterion("FINANCE_COMPANY_ID <>", value, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdGreaterThan(Long value) {
            addCriterion("FINANCE_COMPANY_ID >", value, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FINANCE_COMPANY_ID >=", value, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdLessThan(Long value) {
            addCriterion("FINANCE_COMPANY_ID <", value, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("FINANCE_COMPANY_ID <=", value, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdIn(List<Long> values) {
            addCriterion("FINANCE_COMPANY_ID in", values, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdNotIn(List<Long> values) {
            addCriterion("FINANCE_COMPANY_ID not in", values, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdBetween(Long value1, Long value2) {
            addCriterion("FINANCE_COMPANY_ID between", value1, value2, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("FINANCE_COMPANY_ID not between", value1, value2, "financeCompanyId");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationIsNull() {
            addCriterion("FINANCE_COMPANY_ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationIsNotNull() {
            addCriterion("FINANCE_COMPANY_ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationEqualTo(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION =", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationNotEqualTo(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION <>", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationGreaterThan(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION >", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION >=", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationLessThan(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION <", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION <=", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationLike(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION like", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationNotLike(String value) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION not like", value, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationIn(List<String> values) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION in", values, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationNotIn(List<String> values) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION not in", values, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationBetween(String value1, String value2) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION between", value1, value2, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andFinanceCompanyAbbreviationNotBetween(String value1, String value2) {
            addCriterion("FINANCE_COMPANY_ABBREVIATION not between", value1, value2, "financeCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Long value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Long value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Long value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Long value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Long> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Long> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("PAYMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("PAYMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Long value) {
            addCriterion("PAYMENT_STATUS =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Long value) {
            addCriterion("PAYMENT_STATUS <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Long value) {
            addCriterion("PAYMENT_STATUS >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_STATUS >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Long value) {
            addCriterion("PAYMENT_STATUS <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_STATUS <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Long> values) {
            addCriterion("PAYMENT_STATUS in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Long> values) {
            addCriterion("PAYMENT_STATUS not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_STATUS between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_STATUS not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andInvestorNameIsNull() {
            addCriterion("INVESTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvestorNameIsNotNull() {
            addCriterion("INVESTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorNameEqualTo(String value) {
            addCriterion("INVESTOR_NAME =", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameNotEqualTo(String value) {
            addCriterion("INVESTOR_NAME <>", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameGreaterThan(String value) {
            addCriterion("INVESTOR_NAME >", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTOR_NAME >=", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameLessThan(String value) {
            addCriterion("INVESTOR_NAME <", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameLessThanOrEqualTo(String value) {
            addCriterion("INVESTOR_NAME <=", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameLike(String value) {
            addCriterion("INVESTOR_NAME like", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameNotLike(String value) {
            addCriterion("INVESTOR_NAME not like", value, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameIn(List<String> values) {
            addCriterion("INVESTOR_NAME in", values, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameNotIn(List<String> values) {
            addCriterion("INVESTOR_NAME not in", values, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameBetween(String value1, String value2) {
            addCriterion("INVESTOR_NAME between", value1, value2, "investorName");
            return (Criteria) this;
        }

        public Criteria andInvestorNameNotBetween(String value1, String value2) {
            addCriterion("INVESTOR_NAME not between", value1, value2, "investorName");
            return (Criteria) this;
        }

        public Criteria andAddedNameIsNull() {
            addCriterion("ADDED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddedNameIsNotNull() {
            addCriterion("ADDED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddedNameEqualTo(String value) {
            addCriterion("ADDED_NAME =", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameNotEqualTo(String value) {
            addCriterion("ADDED_NAME <>", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameGreaterThan(String value) {
            addCriterion("ADDED_NAME >", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDED_NAME >=", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameLessThan(String value) {
            addCriterion("ADDED_NAME <", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameLessThanOrEqualTo(String value) {
            addCriterion("ADDED_NAME <=", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameLike(String value) {
            addCriterion("ADDED_NAME like", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameNotLike(String value) {
            addCriterion("ADDED_NAME not like", value, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameIn(List<String> values) {
            addCriterion("ADDED_NAME in", values, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameNotIn(List<String> values) {
            addCriterion("ADDED_NAME not in", values, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameBetween(String value1, String value2) {
            addCriterion("ADDED_NAME between", value1, value2, "addedName");
            return (Criteria) this;
        }

        public Criteria andAddedNameNotBetween(String value1, String value2) {
            addCriterion("ADDED_NAME not between", value1, value2, "addedName");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListIsNull() {
            addCriterion("SUPPLIER_ID_LIST is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListIsNotNull() {
            addCriterion("SUPPLIER_ID_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListEqualTo(String value) {
            addCriterion("SUPPLIER_ID_LIST =", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListNotEqualTo(String value) {
            addCriterion("SUPPLIER_ID_LIST <>", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListGreaterThan(String value) {
            addCriterion("SUPPLIER_ID_LIST >", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID_LIST >=", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListLessThan(String value) {
            addCriterion("SUPPLIER_ID_LIST <", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID_LIST <=", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListLike(String value) {
            addCriterion("SUPPLIER_ID_LIST like", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListNotLike(String value) {
            addCriterion("SUPPLIER_ID_LIST not like", value, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListIn(List<String> values) {
            addCriterion("SUPPLIER_ID_LIST in", values, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListNotIn(List<String> values) {
            addCriterion("SUPPLIER_ID_LIST not in", values, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID_LIST between", value1, value2, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierIdListNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID_LIST not between", value1, value2, "supplierIdList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListIsNull() {
            addCriterion("SUPPLIER_NAME_LIST is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListIsNotNull() {
            addCriterion("SUPPLIER_NAME_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_LIST =", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_LIST <>", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME_LIST >", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_LIST >=", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListLessThan(String value) {
            addCriterion("SUPPLIER_NAME_LIST <", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_LIST <=", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListLike(String value) {
            addCriterion("SUPPLIER_NAME_LIST like", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListNotLike(String value) {
            addCriterion("SUPPLIER_NAME_LIST not like", value, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListIn(List<String> values) {
            addCriterion("SUPPLIER_NAME_LIST in", values, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME_LIST not in", values, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME_LIST between", value1, value2, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andSupplierNameListNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME_LIST not between", value1, value2, "supplierNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListIsNull() {
            addCriterion("FACTORY_ID_LIST is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListIsNotNull() {
            addCriterion("FACTORY_ID_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListEqualTo(String value) {
            addCriterion("FACTORY_ID_LIST =", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListNotEqualTo(String value) {
            addCriterion("FACTORY_ID_LIST <>", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListGreaterThan(String value) {
            addCriterion("FACTORY_ID_LIST >", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID_LIST >=", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListLessThan(String value) {
            addCriterion("FACTORY_ID_LIST <", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID_LIST <=", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListLike(String value) {
            addCriterion("FACTORY_ID_LIST like", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListNotLike(String value) {
            addCriterion("FACTORY_ID_LIST not like", value, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListIn(List<String> values) {
            addCriterion("FACTORY_ID_LIST in", values, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListNotIn(List<String> values) {
            addCriterion("FACTORY_ID_LIST not in", values, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListBetween(String value1, String value2) {
            addCriterion("FACTORY_ID_LIST between", value1, value2, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryIdListNotBetween(String value1, String value2) {
            addCriterion("FACTORY_ID_LIST not between", value1, value2, "factoryIdList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListIsNull() {
            addCriterion("FACTORY_NAME_LIST is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListIsNotNull() {
            addCriterion("FACTORY_NAME_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListEqualTo(String value) {
            addCriterion("FACTORY_NAME_LIST =", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListNotEqualTo(String value) {
            addCriterion("FACTORY_NAME_LIST <>", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListGreaterThan(String value) {
            addCriterion("FACTORY_NAME_LIST >", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME_LIST >=", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListLessThan(String value) {
            addCriterion("FACTORY_NAME_LIST <", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME_LIST <=", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListLike(String value) {
            addCriterion("FACTORY_NAME_LIST like", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListNotLike(String value) {
            addCriterion("FACTORY_NAME_LIST not like", value, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListIn(List<String> values) {
            addCriterion("FACTORY_NAME_LIST in", values, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListNotIn(List<String> values) {
            addCriterion("FACTORY_NAME_LIST not in", values, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME_LIST between", value1, value2, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andFactoryNameListNotBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME_LIST not between", value1, value2, "factoryNameList");
            return (Criteria) this;
        }

        public Criteria andProductLineNameIsNull() {
            addCriterion("PRODUCT_LINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductLineNameIsNotNull() {
            addCriterion("PRODUCT_LINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineNameEqualTo(String value) {
            addCriterion("PRODUCT_LINE_NAME =", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotEqualTo(String value) {
            addCriterion("PRODUCT_LINE_NAME <>", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameGreaterThan(String value) {
            addCriterion("PRODUCT_LINE_NAME >", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LINE_NAME >=", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameLessThan(String value) {
            addCriterion("PRODUCT_LINE_NAME <", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LINE_NAME <=", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameLike(String value) {
            addCriterion("PRODUCT_LINE_NAME like", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotLike(String value) {
            addCriterion("PRODUCT_LINE_NAME not like", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameIn(List<String> values) {
            addCriterion("PRODUCT_LINE_NAME in", values, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotIn(List<String> values) {
            addCriterion("PRODUCT_LINE_NAME not in", values, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_LINE_NAME between", value1, value2, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_LINE_NAME not between", value1, value2, "productLineName");
            return (Criteria) this;
        }

        public Criteria andPositionIdListIsNull() {
            addCriterion("POSITION_ID_LIST is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdListIsNotNull() {
            addCriterion("POSITION_ID_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdListEqualTo(String value) {
            addCriterion("POSITION_ID_LIST =", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListNotEqualTo(String value) {
            addCriterion("POSITION_ID_LIST <>", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListGreaterThan(String value) {
            addCriterion("POSITION_ID_LIST >", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_ID_LIST >=", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListLessThan(String value) {
            addCriterion("POSITION_ID_LIST <", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListLessThanOrEqualTo(String value) {
            addCriterion("POSITION_ID_LIST <=", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListLike(String value) {
            addCriterion("POSITION_ID_LIST like", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListNotLike(String value) {
            addCriterion("POSITION_ID_LIST not like", value, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListIn(List<String> values) {
            addCriterion("POSITION_ID_LIST in", values, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListNotIn(List<String> values) {
            addCriterion("POSITION_ID_LIST not in", values, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListBetween(String value1, String value2) {
            addCriterion("POSITION_ID_LIST between", value1, value2, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionIdListNotBetween(String value1, String value2) {
            addCriterion("POSITION_ID_LIST not between", value1, value2, "positionIdList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListIsNull() {
            addCriterion("POSITION_NAME_LIST is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameListIsNotNull() {
            addCriterion("POSITION_NAME_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameListEqualTo(String value) {
            addCriterion("POSITION_NAME_LIST =", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListNotEqualTo(String value) {
            addCriterion("POSITION_NAME_LIST <>", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListGreaterThan(String value) {
            addCriterion("POSITION_NAME_LIST >", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME_LIST >=", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListLessThan(String value) {
            addCriterion("POSITION_NAME_LIST <", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListLessThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME_LIST <=", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListLike(String value) {
            addCriterion("POSITION_NAME_LIST like", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListNotLike(String value) {
            addCriterion("POSITION_NAME_LIST not like", value, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListIn(List<String> values) {
            addCriterion("POSITION_NAME_LIST in", values, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListNotIn(List<String> values) {
            addCriterion("POSITION_NAME_LIST not in", values, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListBetween(String value1, String value2) {
            addCriterion("POSITION_NAME_LIST between", value1, value2, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andPositionNameListNotBetween(String value1, String value2) {
            addCriterion("POSITION_NAME_LIST not between", value1, value2, "positionNameList");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("DEPARTMENT_NAME >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("DEPARTMENT_NAME <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("DEPARTMENT_NAME like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("DEPARTMENT_NAME not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeIsNull() {
            addCriterion("DELIVERY_OWNER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeIsNotNull() {
            addCriterion("DELIVERY_OWNER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_TYPE =", value, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeNotEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_TYPE <>", value, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeGreaterThan(Long value) {
            addCriterion("DELIVERY_OWNER_TYPE >", value, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_TYPE >=", value, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeLessThan(Long value) {
            addCriterion("DELIVERY_OWNER_TYPE <", value, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_TYPE <=", value, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeIn(List<Long> values) {
            addCriterion("DELIVERY_OWNER_TYPE in", values, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeNotIn(List<Long> values) {
            addCriterion("DELIVERY_OWNER_TYPE not in", values, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_OWNER_TYPE between", value1, value2, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerTypeNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_OWNER_TYPE not between", value1, value2, "deliveryOwnerType");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameIsNull() {
            addCriterion("DELIVERY_OWNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameIsNotNull() {
            addCriterion("DELIVERY_OWNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameEqualTo(String value) {
            addCriterion("DELIVERY_OWNER_NAME =", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameNotEqualTo(String value) {
            addCriterion("DELIVERY_OWNER_NAME <>", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameGreaterThan(String value) {
            addCriterion("DELIVERY_OWNER_NAME >", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_OWNER_NAME >=", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameLessThan(String value) {
            addCriterion("DELIVERY_OWNER_NAME <", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_OWNER_NAME <=", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameLike(String value) {
            addCriterion("DELIVERY_OWNER_NAME like", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameNotLike(String value) {
            addCriterion("DELIVERY_OWNER_NAME not like", value, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameIn(List<String> values) {
            addCriterion("DELIVERY_OWNER_NAME in", values, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameNotIn(List<String> values) {
            addCriterion("DELIVERY_OWNER_NAME not in", values, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameBetween(String value1, String value2) {
            addCriterion("DELIVERY_OWNER_NAME between", value1, value2, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerNameNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_OWNER_NAME not between", value1, value2, "deliveryOwnerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdIsNull() {
            addCriterion("DELIVERY_OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdIsNotNull() {
            addCriterion("DELIVERY_OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_ID =", value, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdNotEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_ID <>", value, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdGreaterThan(Long value) {
            addCriterion("DELIVERY_OWNER_ID >", value, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_ID >=", value, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdLessThan(Long value) {
            addCriterion("DELIVERY_OWNER_ID <", value, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_OWNER_ID <=", value, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdIn(List<Long> values) {
            addCriterion("DELIVERY_OWNER_ID in", values, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdNotIn(List<Long> values) {
            addCriterion("DELIVERY_OWNER_ID not in", values, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_OWNER_ID between", value1, value2, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_OWNER_ID not between", value1, value2, "deliveryOwnerId");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeIsNull() {
            addCriterion("FINANCE_APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeIsNotNull() {
            addCriterion("FINANCE_APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeEqualTo(String value) {
            addCriterion("FINANCE_APPLY_CODE =", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeNotEqualTo(String value) {
            addCriterion("FINANCE_APPLY_CODE <>", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeGreaterThan(String value) {
            addCriterion("FINANCE_APPLY_CODE >", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCE_APPLY_CODE >=", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeLessThan(String value) {
            addCriterion("FINANCE_APPLY_CODE <", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("FINANCE_APPLY_CODE <=", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeLike(String value) {
            addCriterion("FINANCE_APPLY_CODE like", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeNotLike(String value) {
            addCriterion("FINANCE_APPLY_CODE not like", value, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeIn(List<String> values) {
            addCriterion("FINANCE_APPLY_CODE in", values, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeNotIn(List<String> values) {
            addCriterion("FINANCE_APPLY_CODE not in", values, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeBetween(String value1, String value2) {
            addCriterion("FINANCE_APPLY_CODE between", value1, value2, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andFinanceApplyCodeNotBetween(String value1, String value2) {
            addCriterion("FINANCE_APPLY_CODE not between", value1, value2, "financeApplyCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeIsNull() {
            addCriterion("PURCHASE_CHANNEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeIsNotNull() {
            addCriterion("PURCHASE_CHANNEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeEqualTo(Long value) {
            addCriterion("PURCHASE_CHANNEL_TYPE =", value, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeNotEqualTo(Long value) {
            addCriterion("PURCHASE_CHANNEL_TYPE <>", value, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeGreaterThan(Long value) {
            addCriterion("PURCHASE_CHANNEL_TYPE >", value, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_CHANNEL_TYPE >=", value, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeLessThan(Long value) {
            addCriterion("PURCHASE_CHANNEL_TYPE <", value, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_CHANNEL_TYPE <=", value, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeIn(List<Long> values) {
            addCriterion("PURCHASE_CHANNEL_TYPE in", values, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeNotIn(List<Long> values) {
            addCriterion("PURCHASE_CHANNEL_TYPE not in", values, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_CHANNEL_TYPE between", value1, value2, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPurchaseChannelTypeNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_CHANNEL_TYPE not between", value1, value2, "purchaseChannelType");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("PAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("PAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_AMOUNT in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_AMOUNT not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_AMOUNT between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_AMOUNT not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityIsNull() {
            addCriterion("PURCHASE_TOTAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityIsNotNull() {
            addCriterion("PURCHASE_TOTAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityEqualTo(Long value) {
            addCriterion("PURCHASE_TOTAL_QUANTITY =", value, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityNotEqualTo(Long value) {
            addCriterion("PURCHASE_TOTAL_QUANTITY <>", value, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityGreaterThan(Long value) {
            addCriterion("PURCHASE_TOTAL_QUANTITY >", value, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_TOTAL_QUANTITY >=", value, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityLessThan(Long value) {
            addCriterion("PURCHASE_TOTAL_QUANTITY <", value, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_TOTAL_QUANTITY <=", value, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityIn(List<Long> values) {
            addCriterion("PURCHASE_TOTAL_QUANTITY in", values, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityNotIn(List<Long> values) {
            addCriterion("PURCHASE_TOTAL_QUANTITY not in", values, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_TOTAL_QUANTITY between", value1, value2, "purchaseTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalQuantityNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_TOTAL_QUANTITY not between", value1, value2, "purchaseTotalQuantity");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}