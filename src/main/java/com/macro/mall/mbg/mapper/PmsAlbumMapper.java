package com.macro.mall.mbg.mapper;

import com.macro.mall.model.PmsAlbum;
import com.macro.mall.model.PmsAlbumExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsAlbumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( PmsAlbumExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( PmsAlbumExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( PmsAlbum record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( PmsAlbum record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsAlbum> selectByExample ( PmsAlbumExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    PmsAlbum selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( PmsAlbum record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( PmsAlbum record );
}