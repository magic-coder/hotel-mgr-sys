package com.mk.hms.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.id
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.loginname
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.psw
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private String psw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.groupid
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private Long groupid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.name
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.visible
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private String visible;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.begintime
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private Date begintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.endtime
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    private Date endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.id
     *
     * @return the value of h_user.id
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.id
     *
     * @param id the value for h_user.id
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.loginname
     *
     * @return the value of h_user.loginname
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.loginname
     *
     * @param loginname the value for h_user.loginname
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.psw
     *
     * @return the value of h_user.psw
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public String getPsw() {
        return psw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.psw
     *
     * @param psw the value for h_user.psw
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.groupid
     *
     * @return the value of h_user.groupid
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public Long getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.groupid
     *
     * @param groupid the value for h_user.groupid
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.name
     *
     * @return the value of h_user.name
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.name
     *
     * @param name the value for h_user.name
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.visible
     *
     * @return the value of h_user.visible
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public String getVisible() {
        return visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.visible
     *
     * @param visible the value for h_user.visible
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setVisible(String visible) {
        this.visible = visible == null ? null : visible.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.begintime
     *
     * @return the value of h_user.begintime
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.begintime
     *
     * @param begintime the value for h_user.begintime
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.endtime
     *
     * @return the value of h_user.endtime
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.endtime
     *
     * @param endtime the value for h_user.endtime
     *
     * @mbggenerated Tue Jul 21 18:17:53 CST 2015
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}