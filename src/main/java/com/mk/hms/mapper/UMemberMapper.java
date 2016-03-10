package com.mk.hms.mapper;

import com.mk.hms.model.UMember;
import com.mk.hms.model.UMemberCriteria;
import com.mk.hms.model.UMemberWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int countByExample(UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int deleteByExample(UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int deleteByPrimaryKey(Long mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int insert(UMemberWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int insertSelective(UMemberWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    List<UMemberWithBLOBs> selectByExampleWithBLOBs(UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    List<UMember> selectByExample(UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    UMemberWithBLOBs selectByPrimaryKey(Long mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int updateByExampleSelective(@Param("record") UMemberWithBLOBs record, @Param("example") UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") UMemberWithBLOBs record, @Param("example") UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int updateByExample(@Param("record") UMember record, @Param("example") UMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int updateByPrimaryKeySelective(UMemberWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(UMemberWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_member
     *
     * @mbggenerated Sat Aug 22 13:07:51 CST 2015
     */
    int updateByPrimaryKey(UMember record);
}