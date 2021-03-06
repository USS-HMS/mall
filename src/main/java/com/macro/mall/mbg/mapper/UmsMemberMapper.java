package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsMemberExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsMemberExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsMember record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsMember record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsMember> selectByExample ( UmsMemberExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsMember selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsMember record, @Param("example") UmsMemberExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsMember record, @Param("example") UmsMemberExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsMember record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsMember record );
}