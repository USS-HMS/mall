package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsAdminRoleRelation;
import com.macro.mall.model.UmsAdminRoleRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsAdminRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsAdminRoleRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsAdminRoleRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsAdminRoleRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsAdminRoleRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsAdminRoleRelation> selectByExample ( UmsAdminRoleRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsAdminRoleRelation selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsAdminRoleRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsAdminRoleRelation record );
}