package com.macro.mall.mbg.mapper;

import com.macro.mall.model.PmsAlbumPic;
import com.macro.mall.model.PmsAlbumPicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsAlbumPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    long countByExample ( PmsAlbumPicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByExample ( PmsAlbumPicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int deleteByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insert ( PmsAlbumPic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int insertSelective ( PmsAlbumPic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    List<PmsAlbumPic> selectByExample ( PmsAlbumPicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    PmsAlbumPic selectByPrimaryKey ( Long id );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExampleSelective ( @Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByExample ( @Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKeySelective ( PmsAlbumPic record );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Apr 29 21:35:42 CST 2020
     */
    int updateByPrimaryKey ( PmsAlbumPic record );
}