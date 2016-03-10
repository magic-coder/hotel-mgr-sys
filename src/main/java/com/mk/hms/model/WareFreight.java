package com.mk.hms.model;

import java.math.BigDecimal;

public class WareFreight {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_freight.id
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_freight.deliveryInfo
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    private String deliveryinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_freight.baseFreight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    private BigDecimal basefreight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_freight.actualFreight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    private BigDecimal actualfreight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_freight.freightDesc
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    private String freightdesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_freight.id
     *
     * @return the value of h_shopping_ware_freight.id
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_freight.id
     *
     * @param id the value for h_shopping_ware_freight.id
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_freight.deliveryInfo
     *
     * @return the value of h_shopping_ware_freight.deliveryInfo
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public String getDeliveryinfo() {
        return deliveryinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_freight.deliveryInfo
     *
     * @param deliveryinfo the value for h_shopping_ware_freight.deliveryInfo
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setDeliveryinfo(String deliveryinfo) {
        this.deliveryinfo = deliveryinfo == null ? null : deliveryinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_freight.baseFreight
     *
     * @return the value of h_shopping_ware_freight.baseFreight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public BigDecimal getBasefreight() {
        return basefreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_freight.baseFreight
     *
     * @param basefreight the value for h_shopping_ware_freight.baseFreight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setBasefreight(BigDecimal basefreight) {
        this.basefreight = basefreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_freight.actualFreight
     *
     * @return the value of h_shopping_ware_freight.actualFreight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public BigDecimal getActualfreight() {
        return actualfreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_freight.actualFreight
     *
     * @param actualfreight the value for h_shopping_ware_freight.actualFreight
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setActualfreight(BigDecimal actualfreight) {
        this.actualfreight = actualfreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_freight.freightDesc
     *
     * @return the value of h_shopping_ware_freight.freightDesc
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public String getFreightdesc() {
        return freightdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_freight.freightDesc
     *
     * @param freightdesc the value for h_shopping_ware_freight.freightDesc
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    public void setFreightdesc(String freightdesc) {
        this.freightdesc = freightdesc == null ? null : freightdesc.trim();
    }
}