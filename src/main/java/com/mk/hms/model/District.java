package com.mk.hms.model;

import java.math.BigDecimal;

public class District {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.id
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.Code
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.DisName
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private String disName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.CityID
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private Integer cityID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.DisSort
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private Integer disSort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.latitude
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private BigDecimal latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_district.longitude
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    private BigDecimal longitude;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.id
     *
     * @return the value of t_district.id
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.id
     *
     * @param id the value for t_district.id
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.Code
     *
     * @return the value of t_district.Code
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.Code
     *
     * @param code the value for t_district.Code
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.DisName
     *
     * @return the value of t_district.DisName
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public String getDisName() {
        return disName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.DisName
     *
     * @param disName the value for t_district.DisName
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setDisName(String disName) {
        this.disName = disName == null ? null : disName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.CityID
     *
     * @return the value of t_district.CityID
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public Integer getCityID() {
        return cityID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.CityID
     *
     * @param cityID the value for t_district.CityID
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.DisSort
     *
     * @return the value of t_district.DisSort
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public Integer getDisSort() {
        return disSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.DisSort
     *
     * @param disSort the value for t_district.DisSort
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setDisSort(Integer disSort) {
        this.disSort = disSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.latitude
     *
     * @return the value of t_district.latitude
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.latitude
     *
     * @param latitude the value for t_district.latitude
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_district.longitude
     *
     * @return the value of t_district.longitude
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_district.longitude
     *
     * @param longitude the value for t_district.longitude
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}