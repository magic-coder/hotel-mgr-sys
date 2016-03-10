package com.mk.hms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillCheckInfoCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public BillCheckInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
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
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
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

        public Criteria andBillcheckidIsNull() {
            addCriterion("billcheckid is null");
            return (Criteria) this;
        }

        public Criteria andBillcheckidIsNotNull() {
            addCriterion("billcheckid is not null");
            return (Criteria) this;
        }

        public Criteria andBillcheckidEqualTo(Long value) {
            addCriterion("billcheckid =", value, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidNotEqualTo(Long value) {
            addCriterion("billcheckid <>", value, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidGreaterThan(Long value) {
            addCriterion("billcheckid >", value, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidGreaterThanOrEqualTo(Long value) {
            addCriterion("billcheckid >=", value, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidLessThan(Long value) {
            addCriterion("billcheckid <", value, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidLessThanOrEqualTo(Long value) {
            addCriterion("billcheckid <=", value, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidIn(List<Long> values) {
            addCriterion("billcheckid in", values, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidNotIn(List<Long> values) {
            addCriterion("billcheckid not in", values, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidBetween(Long value1, Long value2) {
            addCriterion("billcheckid between", value1, value2, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andBillcheckidNotBetween(Long value1, Long value2) {
            addCriterion("billcheckid not between", value1, value2, "billcheckid");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checktime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checktime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checktime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCheckuseridIsNull() {
            addCriterion("checkuserid is null");
            return (Criteria) this;
        }

        public Criteria andCheckuseridIsNotNull() {
            addCriterion("checkuserid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckuseridEqualTo(Long value) {
            addCriterion("checkuserid =", value, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridNotEqualTo(Long value) {
            addCriterion("checkuserid <>", value, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridGreaterThan(Long value) {
            addCriterion("checkuserid >", value, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("checkuserid >=", value, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridLessThan(Long value) {
            addCriterion("checkuserid <", value, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridLessThanOrEqualTo(Long value) {
            addCriterion("checkuserid <=", value, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridIn(List<Long> values) {
            addCriterion("checkuserid in", values, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridNotIn(List<Long> values) {
            addCriterion("checkuserid not in", values, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridBetween(Long value1, Long value2) {
            addCriterion("checkuserid between", value1, value2, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckuseridNotBetween(Long value1, Long value2) {
            addCriterion("checkuserid not between", value1, value2, "checkuserid");
            return (Criteria) this;
        }

        public Criteria andCheckusernameIsNull() {
            addCriterion("checkusername is null");
            return (Criteria) this;
        }

        public Criteria andCheckusernameIsNotNull() {
            addCriterion("checkusername is not null");
            return (Criteria) this;
        }

        public Criteria andCheckusernameEqualTo(String value) {
            addCriterion("checkusername =", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameNotEqualTo(String value) {
            addCriterion("checkusername <>", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameGreaterThan(String value) {
            addCriterion("checkusername >", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameGreaterThanOrEqualTo(String value) {
            addCriterion("checkusername >=", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameLessThan(String value) {
            addCriterion("checkusername <", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameLessThanOrEqualTo(String value) {
            addCriterion("checkusername <=", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameLike(String value) {
            addCriterion("checkusername like", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameNotLike(String value) {
            addCriterion("checkusername not like", value, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameIn(List<String> values) {
            addCriterion("checkusername in", values, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameNotIn(List<String> values) {
            addCriterion("checkusername not in", values, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameBetween(String value1, String value2) {
            addCriterion("checkusername between", value1, value2, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckusernameNotBetween(String value1, String value2) {
            addCriterion("checkusername not between", value1, value2, "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckmemoIsNull() {
            addCriterion("checkmemo is null");
            return (Criteria) this;
        }

        public Criteria andCheckmemoIsNotNull() {
            addCriterion("checkmemo is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmemoEqualTo(String value) {
            addCriterion("checkmemo =", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoNotEqualTo(String value) {
            addCriterion("checkmemo <>", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoGreaterThan(String value) {
            addCriterion("checkmemo >", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoGreaterThanOrEqualTo(String value) {
            addCriterion("checkmemo >=", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoLessThan(String value) {
            addCriterion("checkmemo <", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoLessThanOrEqualTo(String value) {
            addCriterion("checkmemo <=", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoLike(String value) {
            addCriterion("checkmemo like", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoNotLike(String value) {
            addCriterion("checkmemo not like", value, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoIn(List<String> values) {
            addCriterion("checkmemo in", values, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoNotIn(List<String> values) {
            addCriterion("checkmemo not in", values, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoBetween(String value1, String value2) {
            addCriterion("checkmemo between", value1, value2, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckmemoNotBetween(String value1, String value2) {
            addCriterion("checkmemo not between", value1, value2, "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkstatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(Integer value) {
            addCriterion("checkstatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(Integer value) {
            addCriterion("checkstatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(Integer value) {
            addCriterion("checkstatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkstatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(Integer value) {
            addCriterion("checkstatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkstatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<Integer> values) {
            addCriterion("checkstatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<Integer> values) {
            addCriterion("checkstatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("checkstatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkstatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextIsNull() {
            addCriterion("checkstatustext is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextIsNotNull() {
            addCriterion("checkstatustext is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextEqualTo(String value) {
            addCriterion("checkstatustext =", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextNotEqualTo(String value) {
            addCriterion("checkstatustext <>", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextGreaterThan(String value) {
            addCriterion("checkstatustext >", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextGreaterThanOrEqualTo(String value) {
            addCriterion("checkstatustext >=", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextLessThan(String value) {
            addCriterion("checkstatustext <", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextLessThanOrEqualTo(String value) {
            addCriterion("checkstatustext <=", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextLike(String value) {
            addCriterion("checkstatustext like", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextNotLike(String value) {
            addCriterion("checkstatustext not like", value, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextIn(List<String> values) {
            addCriterion("checkstatustext in", values, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextNotIn(List<String> values) {
            addCriterion("checkstatustext not in", values, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextBetween(String value1, String value2) {
            addCriterion("checkstatustext between", value1, value2, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextNotBetween(String value1, String value2) {
            addCriterion("checkstatustext not between", value1, value2, "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andBackuseridIsNull() {
            addCriterion("backuserid is null");
            return (Criteria) this;
        }

        public Criteria andBackuseridIsNotNull() {
            addCriterion("backuserid is not null");
            return (Criteria) this;
        }

        public Criteria andBackuseridEqualTo(Long value) {
            addCriterion("backuserid =", value, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridNotEqualTo(Long value) {
            addCriterion("backuserid <>", value, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridGreaterThan(Long value) {
            addCriterion("backuserid >", value, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("backuserid >=", value, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridLessThan(Long value) {
            addCriterion("backuserid <", value, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridLessThanOrEqualTo(Long value) {
            addCriterion("backuserid <=", value, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridIn(List<Long> values) {
            addCriterion("backuserid in", values, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridNotIn(List<Long> values) {
            addCriterion("backuserid not in", values, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridBetween(Long value1, Long value2) {
            addCriterion("backuserid between", value1, value2, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackuseridNotBetween(Long value1, Long value2) {
            addCriterion("backuserid not between", value1, value2, "backuserid");
            return (Criteria) this;
        }

        public Criteria andBackusernameIsNull() {
            addCriterion("backusername is null");
            return (Criteria) this;
        }

        public Criteria andBackusernameIsNotNull() {
            addCriterion("backusername is not null");
            return (Criteria) this;
        }

        public Criteria andBackusernameEqualTo(String value) {
            addCriterion("backusername =", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameNotEqualTo(String value) {
            addCriterion("backusername <>", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameGreaterThan(String value) {
            addCriterion("backusername >", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameGreaterThanOrEqualTo(String value) {
            addCriterion("backusername >=", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameLessThan(String value) {
            addCriterion("backusername <", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameLessThanOrEqualTo(String value) {
            addCriterion("backusername <=", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameLike(String value) {
            addCriterion("backusername like", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameNotLike(String value) {
            addCriterion("backusername not like", value, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameIn(List<String> values) {
            addCriterion("backusername in", values, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameNotIn(List<String> values) {
            addCriterion("backusername not in", values, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameBetween(String value1, String value2) {
            addCriterion("backusername between", value1, value2, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackusernameNotBetween(String value1, String value2) {
            addCriterion("backusername not between", value1, value2, "backusername");
            return (Criteria) this;
        }

        public Criteria andBackmemoIsNull() {
            addCriterion("backmemo is null");
            return (Criteria) this;
        }

        public Criteria andBackmemoIsNotNull() {
            addCriterion("backmemo is not null");
            return (Criteria) this;
        }

        public Criteria andBackmemoEqualTo(String value) {
            addCriterion("backmemo =", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoNotEqualTo(String value) {
            addCriterion("backmemo <>", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoGreaterThan(String value) {
            addCriterion("backmemo >", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoGreaterThanOrEqualTo(String value) {
            addCriterion("backmemo >=", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoLessThan(String value) {
            addCriterion("backmemo <", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoLessThanOrEqualTo(String value) {
            addCriterion("backmemo <=", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoLike(String value) {
            addCriterion("backmemo like", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoNotLike(String value) {
            addCriterion("backmemo not like", value, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoIn(List<String> values) {
            addCriterion("backmemo in", values, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoNotIn(List<String> values) {
            addCriterion("backmemo not in", values, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoBetween(String value1, String value2) {
            addCriterion("backmemo between", value1, value2, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBackmemoNotBetween(String value1, String value2) {
            addCriterion("backmemo not between", value1, value2, "backmemo");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNull() {
            addCriterion("backtime is null");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNotNull() {
            addCriterion("backtime is not null");
            return (Criteria) this;
        }

        public Criteria andBacktimeEqualTo(Date value) {
            addCriterion("backtime =", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotEqualTo(Date value) {
            addCriterion("backtime <>", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThan(Date value) {
            addCriterion("backtime >", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("backtime >=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThan(Date value) {
            addCriterion("backtime <", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThanOrEqualTo(Date value) {
            addCriterion("backtime <=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeIn(List<Date> values) {
            addCriterion("backtime in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotIn(List<Date> values) {
            addCriterion("backtime not in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeBetween(Date value1, Date value2) {
            addCriterion("backtime between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotBetween(Date value1, Date value2) {
            addCriterion("backtime not between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andCheckusernameLikeInsensitive(String value) {
            addCriterion("upper(checkusername) like", value.toUpperCase(), "checkusername");
            return (Criteria) this;
        }

        public Criteria andCheckmemoLikeInsensitive(String value) {
            addCriterion("upper(checkmemo) like", value.toUpperCase(), "checkmemo");
            return (Criteria) this;
        }

        public Criteria andCheckstatustextLikeInsensitive(String value) {
            addCriterion("upper(checkstatustext) like", value.toUpperCase(), "checkstatustext");
            return (Criteria) this;
        }

        public Criteria andBackusernameLikeInsensitive(String value) {
            addCriterion("upper(backusername) like", value.toUpperCase(), "backusername");
            return (Criteria) this;
        }

        public Criteria andBackmemoLikeInsensitive(String value) {
            addCriterion("upper(backmemo) like", value.toUpperCase(), "backmemo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table b_bill_check_info
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 22 13:37:48 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table b_bill_check_info
     *
     * @mbggenerated Wed Jul 22 13:37:48 CST 2015
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