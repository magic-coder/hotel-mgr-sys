package com.mk.hms.mapper;

import com.mk.hms.model.HotelBank;
import com.mk.hms.model.HotelBankCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int countByExample(HotelBankCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int deleteByExample(HotelBankCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int insert(HotelBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int insertSelective(HotelBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    List<HotelBank> selectByExample(HotelBankCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    HotelBank selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int updateByExampleSelective(@Param("record") HotelBank record, @Param("example") HotelBankCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int updateByExample(@Param("record") HotelBank record, @Param("example") HotelBankCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int updateByPrimaryKeySelective(HotelBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hotel_bank
     *
     * @mbggenerated Thu Jul 30 09:58:53 CST 2015
     */
    int updateByPrimaryKey(HotelBank record);
}