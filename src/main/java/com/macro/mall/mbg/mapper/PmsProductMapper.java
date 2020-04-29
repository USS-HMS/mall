package com.macro.mall.mbg.mapper;

import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( PmsProduct record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( PmsProduct record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsProduct> selectByExampleWithBLOBs ( PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsProduct> selectByExample ( PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    PmsProduct selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") PmsProduct record, @Param("example") PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleWithBLOBs ( @Param("record") PmsProduct record, @Param("example") PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") PmsProduct record, @Param("example") PmsProductExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( PmsProduct record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs ( PmsProduct record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( PmsProduct record );
}