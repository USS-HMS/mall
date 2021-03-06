package com.macro.mall.mbg.mapper;

import com.macro.mall.model.PmsProductCategoryAttributeRelation;
import com.macro.mall.model.PmsProductCategoryAttributeRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductCategoryAttributeRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( PmsProductCategoryAttributeRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( PmsProductCategoryAttributeRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( PmsProductCategoryAttributeRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( PmsProductCategoryAttributeRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsProductCategoryAttributeRelation> selectByExample ( PmsProductCategoryAttributeRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    PmsProductCategoryAttributeRelation selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") PmsProductCategoryAttributeRelation record, @Param("example") PmsProductCategoryAttributeRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") PmsProductCategoryAttributeRelation record, @Param("example") PmsProductCategoryAttributeRelationExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( PmsProductCategoryAttributeRelation record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( PmsProductCategoryAttributeRelation record );
}