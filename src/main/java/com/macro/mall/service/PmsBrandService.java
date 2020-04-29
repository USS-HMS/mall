package com.macro.mall.service;

import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBrandService {

    List<PmsBrand> listAllBrand();



}
