package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsRolePermissionRelation;
import com.macro.mall.model.UmsRolePermissionRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsRolePermissionRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsRolePermissionRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsRolePermissionRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsRolePermissionRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsRolePermissionRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsRolePermissionRelation> selectByExample ( UmsRolePermissionRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsRolePermissionRelation selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsRolePermissionRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsRolePermissionRelation record );
}