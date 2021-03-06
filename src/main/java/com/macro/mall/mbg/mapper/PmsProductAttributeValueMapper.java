package com.macro.mall.mbg.mapper;

import com.macro.mall.model.PmsProductAttributeValue;
import com.macro.mall.model.PmsProductAttributeValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductAttributeValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( PmsProductAttributeValueExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( PmsProductAttributeValueExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( PmsProductAttributeValue record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( PmsProductAttributeValue record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsProductAttributeValue> selectByExample ( PmsProductAttributeValueExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    PmsProductAttributeValue selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") PmsProductAttributeValue record, @Param("example") PmsProductAttributeValueExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") PmsProductAttributeValue record, @Param("example") PmsProductAttributeValueExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( PmsProductAttributeValue record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( PmsProductAttributeValue record );
}