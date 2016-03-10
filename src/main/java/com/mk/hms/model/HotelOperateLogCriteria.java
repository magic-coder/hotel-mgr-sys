package com.mk.hms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelOperateLogCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public HotelOperateLogCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
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
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
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

        public Criteria andHotelidIsNull() {
            addCriterion("hotelid is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("hotelid is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Long value) {
            addCriterion("hotelid =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Long value) {
            addCriterion("hotelid <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Long value) {
            addCriterion("hotelid >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Long value) {
            addCriterion("hotelid >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Long value) {
            addCriterion("hotelid <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Long value) {
            addCriterion("hotelid <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Long> values) {
            addCriterion("hotelid in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Long> values) {
            addCriterion("hotelid not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Long value1, Long value2) {
            addCriterion("hotelid between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Long value1, Long value2) {
            addCriterion("hotelid not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("hotelname is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("hotelname is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("hotelname =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("hotelname <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("hotelname >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelname >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("hotelname <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("hotelname <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("hotelname like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("hotelname not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("hotelname in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("hotelname not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("hotelname between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("hotelname not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("usercode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("usercode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(Long value) {
            addCriterion("usercode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(Long value) {
            addCriterion("usercode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(Long value) {
            addCriterion("usercode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(Long value) {
            addCriterion("usercode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(Long value) {
            addCriterion("usercode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(Long value) {
            addCriterion("usercode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<Long> values) {
            addCriterion("usercode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<Long> values) {
            addCriterion("usercode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(Long value1, Long value2) {
            addCriterion("usercode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(Long value1, Long value2) {
            addCriterion("usercode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andChecktypeIsNull() {
            addCriterion("checktype is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("checktype is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(Integer value) {
            addCriterion("checktype =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(Integer value) {
            addCriterion("checktype <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(Integer value) {
            addCriterion("checktype >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("checktype >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(Integer value) {
            addCriterion("checktype <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(Integer value) {
            addCriterion("checktype <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<Integer> values) {
            addCriterion("checktype in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<Integer> values) {
            addCriterion("checktype not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(Integer value1, Integer value2) {
            addCriterion("checktype between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("checktype not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypenameIsNull() {
            addCriterion("checktypename is null");
            return (Criteria) this;
        }

        public Criteria andChecktypenameIsNotNull() {
            addCriterion("checktypename is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypenameEqualTo(String value) {
            addCriterion("checktypename =", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameNotEqualTo(String value) {
            addCriterion("checktypename <>", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameGreaterThan(String value) {
            addCriterion("checktypename >", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameGreaterThanOrEqualTo(String value) {
            addCriterion("checktypename >=", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameLessThan(String value) {
            addCriterion("checktypename <", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameLessThanOrEqualTo(String value) {
            addCriterion("checktypename <=", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameLike(String value) {
            addCriterion("checktypename like", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameNotLike(String value) {
            addCriterion("checktypename not like", value, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameIn(List<String> values) {
            addCriterion("checktypename in", values, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameNotIn(List<String> values) {
            addCriterion("checktypename not in", values, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameBetween(String value1, String value2) {
            addCriterion("checktypename between", value1, value2, "checktypename");
            return (Criteria) this;
        }

        public Criteria andChecktypenameNotBetween(String value1, String value2) {
            addCriterion("checktypename not between", value1, value2, "checktypename");
            return (Criteria) this;
        }

        public Criteria andHotelnameLikeInsensitive(String value) {
            addCriterion("upper(hotelname) like", value.toUpperCase(), "hotelname");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andChecktypenameLikeInsensitive(String value) {
            addCriterion("upper(checktypename) like", value.toUpperCase(), "checktypename");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 24 17:56:26 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hotel_operate_log
     *
     * @mbggenerated Fri Jul 24 17:56:26 CST 2015
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