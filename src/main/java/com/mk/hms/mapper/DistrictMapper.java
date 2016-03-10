package com.mk.hms.mapper;

import com.mk.hms.model.District;
import com.mk.hms.model.DistrictCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int countByExample(DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int deleteByExample(DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int insert(District record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int insertSelective(District record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    List<District> selectByExample(DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    District selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int updateByExample(@Param("record") District record, @Param("example") DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int updateByPrimaryKeySelective(District record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_district
     *
     * @mbggenerated Thu Jul 23 10:44:08 CST 2015
     */
    int updateByPrimaryKey(District record);
}