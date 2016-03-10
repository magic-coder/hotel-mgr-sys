package com.mk.hms.mapper;

import com.mk.hms.model.HmsShoppingHotel;
import com.mk.hms.model.HmsShoppingHotelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmsShoppingHotelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int countByExample(HmsShoppingHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int deleteByExample(HmsShoppingHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int insert(HmsShoppingHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int insertSelective(HmsShoppingHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    List<HmsShoppingHotel> selectByExample(HmsShoppingHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    HmsShoppingHotel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int updateByExampleSelective(@Param("record") HmsShoppingHotel record, @Param("example") HmsShoppingHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int updateByExample(@Param("record") HmsShoppingHotel record, @Param("example") HmsShoppingHotelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int updateByPrimaryKeySelective(HmsShoppingHotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_hotel
     *
     * @mbggenerated Fri Aug 14 12:48:03 CST 2015
     */
    int updateByPrimaryKey(HmsShoppingHotel record);
}