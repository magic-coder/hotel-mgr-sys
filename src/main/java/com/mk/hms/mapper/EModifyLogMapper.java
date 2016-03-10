package com.mk.hms.mapper;

import com.mk.hms.model.EModifyLog;
import com.mk.hms.model.EModifyLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EModifyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int countByExample(EModifyLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int deleteByExample(EModifyLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int insert(EModifyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int insertSelective(EModifyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    List<EModifyLog> selectByExample(EModifyLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    EModifyLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") EModifyLog record, @Param("example") EModifyLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int updateByExample(@Param("record") EModifyLog record, @Param("example") EModifyLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int updateByPrimaryKeySelective(EModifyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_modify_log
     *
     * @mbggenerated Wed Dec 23 11:13:12 CST 2015
     */
    int updateByPrimaryKey(EModifyLog record);
}