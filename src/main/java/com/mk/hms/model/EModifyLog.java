package com.mk.hms.model;

import java.util.Date;

public class EModifyLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.id
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.hotelId
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private Long hotelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.oldVal
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private String oldval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.newVal
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private String newval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.tableName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private String tablename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.moduleName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private String modulename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.createUser
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private String createuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.createUserName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private String createusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.createTime
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_modify_log.updateTime
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.id
     *
     * @return the value of e_modify_log.id
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.id
     *
     * @param id the value for e_modify_log.id
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.hotelId
     *
     * @return the value of e_modify_log.hotelId
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public Long getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.hotelId
     *
     * @param hotelid the value for e_modify_log.hotelId
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.oldVal
     *
     * @return the value of e_modify_log.oldVal
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public String getOldval() {
        return oldval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.oldVal
     *
     * @param oldval the value for e_modify_log.oldVal
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setOldval(String oldval) {
        this.oldval = oldval == null ? null : oldval.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.newVal
     *
     * @return the value of e_modify_log.newVal
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public String getNewval() {
        return newval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.newVal
     *
     * @param newval the value for e_modify_log.newVal
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setNewval(String newval) {
        this.newval = newval == null ? null : newval.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.tableName
     *
     * @return the value of e_modify_log.tableName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.tableName
     *
     * @param tablename the value for e_modify_log.tableName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.moduleName
     *
     * @return the value of e_modify_log.moduleName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public String getModulename() {
        return modulename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.moduleName
     *
     * @param modulename the value for e_modify_log.moduleName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.createUser
     *
     * @return the value of e_modify_log.createUser
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.createUser
     *
     * @param createuser the value for e_modify_log.createUser
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.createUserName
     *
     * @return the value of e_modify_log.createUserName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public String getCreateusername() {
        return createusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.createUserName
     *
     * @param createusername the value for e_modify_log.createUserName
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.createTime
     *
     * @return the value of e_modify_log.createTime
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.createTime
     *
     * @param createtime the value for e_modify_log.createTime
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_modify_log.updateTime
     *
     * @return the value of e_modify_log.updateTime
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_modify_log.updateTime
     *
     * @param updatetime the value for e_modify_log.updateTime
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}