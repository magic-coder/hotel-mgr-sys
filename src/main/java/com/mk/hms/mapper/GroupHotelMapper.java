package com.mk.hms.mapper;

import com.mk.hms.model.GroupHotel;
import com.mk.hms.model.GroupHotelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupHotelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int countByExample(GroupHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int deleteByExample(GroupHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int insert(GroupHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int insertSelective(GroupHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    List<GroupHotel> selectByExample(GroupHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    GroupHotel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int updateByExampleSelective(@Param("record") GroupHotel record, @Param("example") GroupHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int updateByExample(@Param("record") GroupHotel record, @Param("example") GroupHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int updateByPrimaryKeySelective(GroupHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_group_hotel
     *
     * @mbggenerated Mon Jul 20 16:46:46 CST 2015
     */
    int updateByPrimaryKey(GroupHotel record);
}