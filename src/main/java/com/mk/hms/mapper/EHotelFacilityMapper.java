package com.mk.hms.mapper;

import com.mk.hms.model.EHotelFacility;
import com.mk.hms.model.EHotelFacilityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EHotelFacilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int countByExample(EHotelFacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int deleteByExample(EHotelFacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int insert(EHotelFacility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int insertSelective(EHotelFacility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    List<EHotelFacility> selectByExample(EHotelFacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    EHotelFacility selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int updateByExampleSelective(@Param("record") EHotelFacility record, @Param("example") EHotelFacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int updateByExample(@Param("record") EHotelFacility record, @Param("example") EHotelFacilityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int updateByPrimaryKeySelective(EHotelFacility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_hotel_facility
     *
     * @mbggenerated Fri Jul 31 09:39:06 CST 2015
     */
    int updateByPrimaryKey(EHotelFacility record);
}