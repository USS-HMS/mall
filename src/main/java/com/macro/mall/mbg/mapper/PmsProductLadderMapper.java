package com.macro.mall.mbg.mapper;

import com.macro.mall.model.PmsProductLadder;
import com.macro.mall.model.PmsProductLadderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductLadderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( PmsProductLadderExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( PmsProductLadderExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( PmsProductLadder record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( PmsProductLadder record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsProductLadder> selectByExample ( PmsProductLadderExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    PmsProductLadder selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( PmsProductLadder record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( PmsProductLadder record );
}