package com.macro.mall.mbg.mapper;

import com.macro.mall.model.UmsIntegrationChangeHistory;
import com.macro.mall.model.UmsIntegrationChangeHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsIntegrationChangeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( UmsIntegrationChangeHistoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( UmsIntegrationChangeHistoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( UmsIntegrationChangeHistory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( UmsIntegrationChangeHistory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<UmsIntegrationChangeHistory> selectByExample ( UmsIntegrationChangeHistoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    UmsIntegrationChangeHistory selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( UmsIntegrationChangeHistory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( UmsIntegrationChangeHistory record );
}