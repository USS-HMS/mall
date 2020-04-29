package com.macro.mall.mbg.mapper;

import com.macro.mall.model.SmsFlashPromotionSession;
import com.macro.mall.model.SmsFlashPromotionSessionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsFlashPromotionSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( SmsFlashPromotionSessionExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( SmsFlashPromotionSessionExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( SmsFlashPromotionSession record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( SmsFlashPromotionSession record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<SmsFlashPromotionSession> selectByExample ( SmsFlashPromotionSessionExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    SmsFlashPromotionSession selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") SmsFlashPromotionSession record, @Param("example") SmsFlashPromotionSessionExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") SmsFlashPromotionSession record, @Param("example") SmsFlashPromotionSessionExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( SmsFlashPromotionSession record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( SmsFlashPromotionSession record );
}