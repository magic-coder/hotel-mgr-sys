package com.mk.hms.mapper;

import com.mk.hms.model.Facility;
import com.mk.hms.model.FacilityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int countByExample(FacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int deleteByExample(FacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int insert(Facility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int insertSelective(Facility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    List<Facility> selectByExample(FacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    Facility selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int updateByExampleSelective(@Param("record") Facility record, @Param("example") FacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int updateByExample(@Param("record") Facility record, @Param("example") FacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int updateByPrimaryKeySelective(Facility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_facility
     *
     * @mbggenerated Wed Jul 29 09:06:06 CST 2015
     */
    int updateByPrimaryKey(Facility record);
}