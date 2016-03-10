package com.mk.hms.model;

import java.util.Date;

public class HotelBankLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.id
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.userCode
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private String userCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.userName
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.oldVal
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private String oldVal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.newVal
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private String newVal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.createTime
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hotel_bank_log.hotelId
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    private Long hotelId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.id
     *
     * @return the value of t_hotel_bank_log.id
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.id
     *
     * @param id the value for t_hotel_bank_log.id
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.userCode
     *
     * @return the value of t_hotel_bank_log.userCode
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.userCode
     *
     * @param userCode the value for t_hotel_bank_log.userCode
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.userName
     *
     * @return the value of t_hotel_bank_log.userName
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.userName
     *
     * @param userName the value for t_hotel_bank_log.userName
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.oldVal
     *
     * @return the value of t_hotel_bank_log.oldVal
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public String getOldVal() {
        return oldVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.oldVal
     *
     * @param oldVal the value for t_hotel_bank_log.oldVal
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setOldVal(String oldVal) {
        this.oldVal = oldVal == null ? null : oldVal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.newVal
     *
     * @return the value of t_hotel_bank_log.newVal
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public String getNewVal() {
        return newVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.newVal
     *
     * @param newVal the value for t_hotel_bank_log.newVal
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setNewVal(String newVal) {
        this.newVal = newVal == null ? null : newVal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.createTime
     *
     * @return the value of t_hotel_bank_log.createTime
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.createTime
     *
     * @param createTime the value for t_hotel_bank_log.createTime
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hotel_bank_log.hotelId
     *
     * @return the value of t_hotel_bank_log.hotelId
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hotel_bank_log.hotelId
     *
     * @param hotelId the value for t_hotel_bank_log.hotelId
     *
     * @mbggenerated Thu Jul 30 11:04:09 CST 2015
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }
}