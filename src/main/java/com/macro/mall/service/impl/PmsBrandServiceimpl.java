package com.macro.mall.service.impl;

import com.macro.mall.mbg.mapper.PmsBrandMapper;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsBrandExample;
import com.macro.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PmsBrandServiceimpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;
    @Override
    public List<PmsBrand> listAllBrand ( ){
         return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }
}
