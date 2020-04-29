package com.macro.mall.mbg.mapper;

import com.macro.mall.model.OmsCompanyAddress;
import com.macro.mall.model.OmsCompanyAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmsCompanyAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( OmsCompanyAddressExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( OmsCompanyAddressExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( OmsCompanyAddress record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( OmsCompanyAddress record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<OmsCompanyAddress> selectByExample ( OmsCompanyAddressExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    OmsCompanyAddress selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( OmsCompanyAddress record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( OmsCompanyAddress record );
}