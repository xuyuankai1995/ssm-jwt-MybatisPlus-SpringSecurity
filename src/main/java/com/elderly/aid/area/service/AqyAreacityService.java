package com.elderly.aid.area.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderly.aid.area.entity.AqyAreacity;

import java.util.List;

/**
 * <p>
 * 地域表-二级地级行政区：包括地级市、地区、自治州、盟。 服务类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
public interface AqyAreacityService extends IService<AqyAreacity> {

    /**
     * 通过省级ID查询城市ID
     * */
    List<AqyAreacity> getCityListByProvinceCode(String ProvinceCode);
}
