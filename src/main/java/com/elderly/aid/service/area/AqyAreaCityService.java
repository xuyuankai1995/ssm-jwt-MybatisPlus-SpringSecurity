package com.elderly.aid.service.area;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderly.aid.entity.area.AqyAreaCity;

import java.util.List;

/**
 * <p>
 * 地域表-二级地级行政区：包括地级市、地区、自治州、盟。 服务类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
public interface AqyAreaCityService extends IService<AqyAreaCity> {

    /**
     * 通过省级ID查询城市ID
     * */
    List<AqyAreaCity> getCityListByProvinceCode(String ProvinceCode);
}
