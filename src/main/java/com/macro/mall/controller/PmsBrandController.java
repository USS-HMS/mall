package com.macro.mall.controller;

import com.macro.mall.mbg.model.PmsBrand;
import com.macro.mall.service.PmsBrandService;
import com.macro.mall.service.impl.PmsBrandServiceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 品牌管理Controller
 * Created by macro on 2019/4/19.
 */
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);


}
