package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsResourceCategory;
import com.macro.mall.model.UmsResourceCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsResourceCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsResourceCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsResourceCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsResourceCategory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsResourceCategory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsResourceCategory> selectByExample ( UmsResourceCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsResourceCategory selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsResourceCategory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsResourceCategory record );
}