package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsResourceExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsResourceExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsResource record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsResource record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsResource> selectByExample ( UmsResourceExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsResource selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsResource record, @Param("example") UmsResourceExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsResource record, @Param("example") UmsResourceExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsResource record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsResource record );
}