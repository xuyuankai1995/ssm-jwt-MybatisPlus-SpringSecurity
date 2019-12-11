package com.elderly.aid.controller.area;


import com.elderly.aid.common.utils.JsonUtils;
import com.elderly.aid.entity.area.AqyAreaProvince;
import com.elderly.aid.models.ApiBaseModels.ApiModelList;
import com.elderly.aid.service.area.AqyAreaProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 区域表-一级省级行政区：包括省、自治区、直辖市、特别行政区； 前端控制器
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Controller
@RequestMapping("/Area/Province")
public class AqyAreaProvinceController {

    @Autowired
    private AqyAreaProvinceService aqyAreaProvinceService;

    @GetMapping(value = "/GetAllProvince",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String GetAllProvince(@RequestParam("keywords") String keywords) throws Exception {
        List<AqyAreaProvince> list = aqyAreaProvinceService.getAllProvinceByName(keywords);
        ApiModelList<AqyAreaProvince> modelList = new ApiModelList().Success(list,"获取成功！");
        return JsonUtils.beanToJson(modelList);
    }
}
