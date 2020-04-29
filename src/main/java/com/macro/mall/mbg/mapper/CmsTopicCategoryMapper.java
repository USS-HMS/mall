package com.macro.mall.mbg.mapper;

import com.macro.mall.model.CmsTopicCategory;
import com.macro.mall.model.CmsTopicCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsTopicCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( CmsTopicCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( CmsTopicCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( CmsTopicCategory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( CmsTopicCategory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<CmsTopicCategory> selectByExample ( CmsTopicCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    CmsTopicCategory selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( CmsTopicCategory record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( CmsTopicCategory record );
}