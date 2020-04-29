package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsRoleMenuRelation;
import com.macro.mall.model.UmsRoleMenuRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsRoleMenuRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsRoleMenuRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsRoleMenuRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsRoleMenuRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsRoleMenuRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsRoleMenuRelation> selectByExample ( UmsRoleMenuRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsRoleMenuRelation selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsRoleMenuRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsRoleMenuRelation record );
}