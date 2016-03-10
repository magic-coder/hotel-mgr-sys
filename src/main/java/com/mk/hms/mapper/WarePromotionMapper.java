package com.mk.hms.mapper;

import com.mk.hms.model.WarePromotion;
import com.mk.hms.model.WarePromotionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarePromotionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int countByExample(WarePromotionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int deleteByExample(WarePromotionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int insert(WarePromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int insertSelective(WarePromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    List<WarePromotion> selectByExample(WarePromotionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    WarePromotion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int updateByExampleSelective(@Param("record") WarePromotion record, @Param("example") WarePromotionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int updateByExample(@Param("record") WarePromotion record, @Param("example") WarePromotionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int updateByPrimaryKeySelective(WarePromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_shopping_ware_promotion
     *
     * @mbggenerated Fri Aug 14 12:29:06 CST 2015
     */
    int updateByPrimaryKey(WarePromotion record);
}