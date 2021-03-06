package com.mk.hms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WareFreightCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public WareFreightCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
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
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
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

        public Criteria andDeliveryinfoIsNull() {
            addCriterion("deliveryInfo is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoIsNotNull() {
            addCriterion("deliveryInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoEqualTo(String value) {
            addCriterion("deliveryInfo =", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoNotEqualTo(String value) {
            addCriterion("deliveryInfo <>", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoGreaterThan(String value) {
            addCriterion("deliveryInfo >", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryInfo >=", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoLessThan(String value) {
            addCriterion("deliveryInfo <", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoLessThanOrEqualTo(String value) {
            addCriterion("deliveryInfo <=", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoLike(String value) {
            addCriterion("deliveryInfo like", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoNotLike(String value) {
            addCriterion("deliveryInfo not like", value, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoIn(List<String> values) {
            addCriterion("deliveryInfo in", values, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoNotIn(List<String> values) {
            addCriterion("deliveryInfo not in", values, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoBetween(String value1, String value2) {
            addCriterion("deliveryInfo between", value1, value2, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoNotBetween(String value1, String value2) {
            addCriterion("deliveryInfo not between", value1, value2, "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andBasefreightIsNull() {
            addCriterion("baseFreight is null");
            return (Criteria) this;
        }

        public Criteria andBasefreightIsNotNull() {
            addCriterion("baseFreight is not null");
            return (Criteria) this;
        }

        public Criteria andBasefreightEqualTo(BigDecimal value) {
            addCriterion("baseFreight =", value, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightNotEqualTo(BigDecimal value) {
            addCriterion("baseFreight <>", value, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightGreaterThan(BigDecimal value) {
            addCriterion("baseFreight >", value, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseFreight >=", value, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightLessThan(BigDecimal value) {
            addCriterion("baseFreight <", value, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseFreight <=", value, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightIn(List<BigDecimal> values) {
            addCriterion("baseFreight in", values, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightNotIn(List<BigDecimal> values) {
            addCriterion("baseFreight not in", values, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseFreight between", value1, value2, "basefreight");
            return (Criteria) this;
        }

        public Criteria andBasefreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseFreight not between", value1, value2, "basefreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightIsNull() {
            addCriterion("actualFreight is null");
            return (Criteria) this;
        }

        public Criteria andActualfreightIsNotNull() {
            addCriterion("actualFreight is not null");
            return (Criteria) this;
        }

        public Criteria andActualfreightEqualTo(BigDecimal value) {
            addCriterion("actualFreight =", value, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightNotEqualTo(BigDecimal value) {
            addCriterion("actualFreight <>", value, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightGreaterThan(BigDecimal value) {
            addCriterion("actualFreight >", value, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actualFreight >=", value, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightLessThan(BigDecimal value) {
            addCriterion("actualFreight <", value, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actualFreight <=", value, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightIn(List<BigDecimal> values) {
            addCriterion("actualFreight in", values, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightNotIn(List<BigDecimal> values) {
            addCriterion("actualFreight not in", values, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualFreight between", value1, value2, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andActualfreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualFreight not between", value1, value2, "actualfreight");
            return (Criteria) this;
        }

        public Criteria andFreightdescIsNull() {
            addCriterion("freightDesc is null");
            return (Criteria) this;
        }

        public Criteria andFreightdescIsNotNull() {
            addCriterion("freightDesc is not null");
            return (Criteria) this;
        }

        public Criteria andFreightdescEqualTo(String value) {
            addCriterion("freightDesc =", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescNotEqualTo(String value) {
            addCriterion("freightDesc <>", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescGreaterThan(String value) {
            addCriterion("freightDesc >", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescGreaterThanOrEqualTo(String value) {
            addCriterion("freightDesc >=", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescLessThan(String value) {
            addCriterion("freightDesc <", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescLessThanOrEqualTo(String value) {
            addCriterion("freightDesc <=", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescLike(String value) {
            addCriterion("freightDesc like", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescNotLike(String value) {
            addCriterion("freightDesc not like", value, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescIn(List<String> values) {
            addCriterion("freightDesc in", values, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescNotIn(List<String> values) {
            addCriterion("freightDesc not in", values, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescBetween(String value1, String value2) {
            addCriterion("freightDesc between", value1, value2, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andFreightdescNotBetween(String value1, String value2) {
            addCriterion("freightDesc not between", value1, value2, "freightdesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryinfoLikeInsensitive(String value) {
            addCriterion("upper(deliveryInfo) like", value.toUpperCase(), "deliveryinfo");
            return (Criteria) this;
        }

        public Criteria andFreightdescLikeInsensitive(String value) {
            addCriterion("upper(freightDesc) like", value.toUpperCase(), "freightdesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 14 12:29:06 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_shopping_ware_freight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
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