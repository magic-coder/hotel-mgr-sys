package com.mk.hms.model;

public class WareCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_category.id
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_category.categoryname
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    private String categoryname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_category.orderby
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    private Integer orderby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_shopping_ware_category.valid
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    private Integer valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_category.id
     *
     * @return the value of h_shopping_ware_category.id
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_category.id
     *
     * @param id the value for h_shopping_ware_category.id
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_category.categoryname
     *
     * @return the value of h_shopping_ware_category.categoryname
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_category.categoryname
     *
     * @param categoryname the value for h_shopping_ware_category.categoryname
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_category.orderby
     *
     * @return the value of h_shopping_ware_category.orderby
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public Integer getOrderby() {
        return orderby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_category.orderby
     *
     * @param orderby the value for h_shopping_ware_category.orderby
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_shopping_ware_category.valid
     *
     * @return the value of h_shopping_ware_category.valid
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_shopping_ware_category.valid
     *
     * @param valid the value for h_shopping_ware_category.valid
     *
     * @mbggenerated Thu Jul 30 12:09:14 CST 2015
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }
}