package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsMemberTask;
import com.macro.mall.model.UmsMemberTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsMemberTaskExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsMemberTaskExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsMemberTask record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsMemberTask record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsMemberTask> selectByExample ( UmsMemberTaskExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsMemberTask selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsMemberTask record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsMemberTask record );
}