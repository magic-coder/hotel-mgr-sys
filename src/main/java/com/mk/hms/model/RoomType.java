package com.mk.hms.model;

import java.math.BigDecimal;

public class RoomType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.id
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.thotelId
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private Long thotelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.ehotelid
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private Long ehotelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.name
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.pms
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private String pms;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.bedNum
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private Integer bedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.roomNum
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private Integer roomNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_roomtype.cost
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    private BigDecimal cost;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.id
     *
     * @return the value of t_roomtype.id
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.id
     *
     * @param id the value for t_roomtype.id
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.thotelId
     *
     * @return the value of t_roomtype.thotelId
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public Long getThotelId() {
        return thotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.thotelId
     *
     * @param thotelId the value for t_roomtype.thotelId
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setThotelId(Long thotelId) {
        this.thotelId = thotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.ehotelid
     *
     * @return the value of t_roomtype.ehotelid
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public Long getEhotelId() {
        return ehotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.ehotelid
     *
     * @param ehotelId the value for t_roomtype.ehotelid
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setEhotelId(Long ehotelId) {
        this.ehotelId = ehotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.name
     *
     * @return the value of t_roomtype.name
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.name
     *
     * @param name the value for t_roomtype.name
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.pms
     *
     * @return the value of t_roomtype.pms
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public String getPms() {
        return pms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.pms
     *
     * @param pms the value for t_roomtype.pms
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setPms(String pms) {
        this.pms = pms == null ? null : pms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.bedNum
     *
     * @return the value of t_roomtype.bedNum
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public Integer getBedNum() {
        return bedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.bedNum
     *
     * @param bedNum the value for t_roomtype.bedNum
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setBedNum(Integer bedNum) {
        this.bedNum = bedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.roomNum
     *
     * @return the value of t_roomtype.roomNum
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.roomNum
     *
     * @param roomNum the value for t_roomtype.roomNum
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_roomtype.cost
     *
     * @return the value of t_roomtype.cost
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_roomtype.cost
     *
     * @param cost the value for t_roomtype.cost
     *
     * @mbggenerated Wed Jul 29 07:33:29 CST 2015
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}