package com.mk.hms.model;

import java.util.Date;

public class TPriceTime {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.id
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.name
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.cron
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private String cron;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.hotelid
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private Long hotelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.Updatetime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.Begintime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private Date beginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pricetime.Endtime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.id
     *
     * @return the value of t_pricetime.id
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.id
     *
     * @param id the value for t_pricetime.id
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.name
     *
     * @return the value of t_pricetime.name
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.name
     *
     * @param name the value for t_pricetime.name
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.cron
     *
     * @return the value of t_pricetime.cron
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public String getCron() {
        return cron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.cron
     *
     * @param cron the value for t_pricetime.cron
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.hotelid
     *
     * @return the value of t_pricetime.hotelid
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.hotelid
     *
     * @param hotelId the value for t_pricetime.hotelid
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.Updatetime
     *
     * @return the value of t_pricetime.Updatetime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.Updatetime
     *
     * @param updateTime the value for t_pricetime.Updatetime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.Begintime
     *
     * @return the value of t_pricetime.Begintime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.Begintime
     *
     * @param beginTime the value for t_pricetime.Begintime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pricetime.Endtime
     *
     * @return the value of t_pricetime.Endtime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_pricetime.Endtime
     *
     * @param endTime the value for t_pricetime.Endtime
     *
     * @mbggenerated Thu Jul 23 23:07:15 CST 2015
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}