package com.macro.mall.mbg.mapper;

import com.macro.mall.model.CmsTopic;
import com.macro.mall.model.CmsTopicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( CmsTopic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( CmsTopic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<CmsTopic> selectByExampleWithBLOBs ( CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<CmsTopic> selectByExample ( CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    CmsTopic selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") CmsTopic record, @Param("example") CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleWithBLOBs ( @Param("record") CmsTopic record, @Param("example") CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") CmsTopic record, @Param("example") CmsTopicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( CmsTopic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs ( CmsTopic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( CmsTopic record );
}