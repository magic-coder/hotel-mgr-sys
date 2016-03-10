package com.mk.hms.mapper;

import com.mk.hms.model.TBussinesszone;
import com.mk.hms.model.TBussinesszoneCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBussinesszoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int countByExample(TBussinesszoneCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int deleteByExample(TBussinesszoneCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int insert(TBussinesszone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int insertSelective(TBussinesszone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    List<TBussinesszone> selectByExample(TBussinesszoneCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    TBussinesszone selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int updateByExampleSelective(@Param("record") TBussinesszone record, @Param("example") TBussinesszoneCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int updateByExample(@Param("record") TBussinesszone record, @Param("example") TBussinesszoneCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int updateByPrimaryKeySelective(TBussinesszone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_businesszone
     *
     * @mbggenerated Sun Aug 02 12:40:23 CST 2015
     */
    int updateByPrimaryKey(TBussinesszone record);
}