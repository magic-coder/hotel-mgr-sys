package com.mk.hms.mapper;

import com.mk.hms.model.ERoomtypeInfo;
import com.mk.hms.model.ERoomtypeInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ERoomtypeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int countByExample(ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int deleteByExample(ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int insert(ERoomtypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int insertSelective(ERoomtypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    List<ERoomtypeInfo> selectByExampleWithBLOBs(ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    List<ERoomtypeInfo> selectByExample(ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    ERoomtypeInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") ERoomtypeInfo record, @Param("example") ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") ERoomtypeInfo record, @Param("example") ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int updateByExample(@Param("record") ERoomtypeInfo record, @Param("example") ERoomtypeInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int updateByPrimaryKeySelective(ERoomtypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(ERoomtypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_roomtype_info
     *
     * @mbggenerated Wed Jul 29 07:42:12 CST 2015
     */
    int updateByPrimaryKey(ERoomtypeInfo record);
}