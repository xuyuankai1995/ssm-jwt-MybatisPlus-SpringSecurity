package com.elderly.aid.area.controller;


import com.elderly.aid.area.service.AqyAreacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 地域表-二级地级行政区：包括地级市、地区、自治州、盟。 前端控制器
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Controller
@RequestMapping("/aqyAreaCity")
public class AqyAreaCityController {

    @Autowired
    private AqyAreacityService aqyAreacityService;
}
