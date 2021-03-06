package com.mk.hms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarePromotionCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public WarePromotionCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBasedataIsNull() {
            addCriterion("baseData is null");
            return (Criteria) this;
        }

        public Criteria andBasedataIsNotNull() {
            addCriterion("baseData is not null");
            return (Criteria) this;
        }

        public Criteria andBasedataEqualTo(BigDecimal value) {
            addCriterion("baseData =", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotEqualTo(BigDecimal value) {
            addCriterion("baseData <>", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataGreaterThan(BigDecimal value) {
            addCriterion("baseData >", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseData >=", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataLessThan(BigDecimal value) {
            addCriterion("baseData <", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseData <=", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataIn(List<BigDecimal> values) {
            addCriterion("baseData in", values, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotIn(List<BigDecimal> values) {
            addCriterion("baseData not in", values, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseData between", value1, value2, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseData not between", value1, value2, "basedata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataIsNull() {
            addCriterion("promotionAData is null");
            return (Criteria) this;
        }

        public Criteria andPromotionadataIsNotNull() {
            addCriterion("promotionAData is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionadataEqualTo(BigDecimal value) {
            addCriterion("promotionAData =", value, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataNotEqualTo(BigDecimal value) {
            addCriterion("promotionAData <>", value, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataGreaterThan(BigDecimal value) {
            addCriterion("promotionAData >", value, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotionAData >=", value, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataLessThan(BigDecimal value) {
            addCriterion("promotionAData <", value, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotionAData <=", value, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataIn(List<BigDecimal> values) {
            addCriterion("promotionAData in", values, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataNotIn(List<BigDecimal> values) {
            addCriterion("promotionAData not in", values, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotionAData between", value1, value2, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotionadataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotionAData not between", value1, value2, "promotionadata");
            return (Criteria) this;
        }

        public Criteria andPromotiondescIsNull() {
            addCriterion("promotionDesc is null");
            return (Criteria) this;
        }

        public Criteria andPromotiondescIsNotNull() {
            addCriterion("promotionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPromotiondescEqualTo(String value) {
            addCriterion("promotionDesc =", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescNotEqualTo(String value) {
            addCriterion("promotionDesc <>", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescGreaterThan(String value) {
            addCriterion("promotionDesc >", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescGreaterThanOrEqualTo(String value) {
            addCriterion("promotionDesc >=", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescLessThan(String value) {
            addCriterion("promotionDesc <", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescLessThanOrEqualTo(String value) {
            addCriterion("promotionDesc <=", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescLike(String value) {
            addCriterion("promotionDesc like", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescNotLike(String value) {
            addCriterion("promotionDesc not like", value, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescIn(List<String> values) {
            addCriterion("promotionDesc in", values, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescNotIn(List<String> values) {
            addCriterion("promotionDesc not in", values, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescBetween(String value1, String value2) {
            addCriterion("promotionDesc between", value1, value2, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andPromotiondescNotBetween(String value1, String value2) {
            addCriterion("promotionDesc not between", value1, value2, "promotiondesc");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeIsNull() {
            addCriterion("promotionType is null");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeIsNotNull() {
            addCriterion("promotionType is not null");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeEqualTo(Integer value) {
            addCriterion("promotionType =", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeNotEqualTo(Integer value) {
            addCriterion("promotionType <>", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeGreaterThan(Integer value) {
            addCriterion("promotionType >", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotionType >=", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeLessThan(Integer value) {
            addCriterion("promotionType <", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("promotionType <=", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeIn(List<Integer> values) {
            addCriterion("promotionType in", values, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeNotIn(List<Integer> values) {
            addCriterion("promotionType not in", values, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeBetween(Integer value1, Integer value2) {
            addCriterion("promotionType between", value1, value2, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotionType not between", value1, value2, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionIsNull() {
            addCriterion("isCyclePromotion is null");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionIsNotNull() {
            addCriterion("isCyclePromotion is not null");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionEqualTo(Integer value) {
            addCriterion("isCyclePromotion =", value, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionNotEqualTo(Integer value) {
            addCriterion("isCyclePromotion <>", value, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionGreaterThan(Integer value) {
            addCriterion("isCyclePromotion >", value, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("isCyclePromotion >=", value, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionLessThan(Integer value) {
            addCriterion("isCyclePromotion <", value, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionLessThanOrEqualTo(Integer value) {
            addCriterion("isCyclePromotion <=", value, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionIn(List<Integer> values) {
            addCriterion("isCyclePromotion in", values, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionNotIn(List<Integer> values) {
            addCriterion("isCyclePromotion not in", values, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionBetween(Integer value1, Integer value2) {
            addCriterion("isCyclePromotion between", value1, value2, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andIscyclepromotionNotBetween(Integer value1, Integer value2) {
            addCriterion("isCyclePromotion not between", value1, value2, "iscyclepromotion");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCretedateIsNull() {
            addCriterion("cretedate is null");
            return (Criteria) this;
        }

        public Criteria andCretedateIsNotNull() {
            addCriterion("cretedate is not null");
            return (Criteria) this;
        }

        public Criteria andCretedateEqualTo(Date value) {
            addCriterion("cretedate =", value, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateNotEqualTo(Date value) {
            addCriterion("cretedate <>", value, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateGreaterThan(Date value) {
            addCriterion("cretedate >", value, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateGreaterThanOrEqualTo(Date value) {
            addCriterion("cretedate >=", value, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateLessThan(Date value) {
            addCriterion("cretedate <", value, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateLessThanOrEqualTo(Date value) {
            addCriterion("cretedate <=", value, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateIn(List<Date> values) {
            addCriterion("cretedate in", values, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateNotIn(List<Date> values) {
            addCriterion("cretedate not in", values, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateBetween(Date value1, Date value2) {
            addCriterion("cretedate between", value1, value2, "cretedate");
            return (Criteria) this;
        }

        public Criteria andCretedateNotBetween(Date value1, Date value2) {
            addCriterion("cretedate not between", value1, value2, "cretedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPromotiondescLikeInsensitive(String value) {
            addCriterion("upper(promotionDesc) like", value.toUpperCase(), "promotiondesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 20 11:19:51 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Thu Aug 20 11:19:51 CST 2015
     */
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