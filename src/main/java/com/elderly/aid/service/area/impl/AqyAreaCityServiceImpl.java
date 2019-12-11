package com.elderly.aid.service.area.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderly.aid.entity.area.AqyAreaCity;
import com.elderly.aid.mapper.area.AqyAreaCityMapper;
import com.elderly.aid.service.area.AqyAreaCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 地域表-二级地级行政区：包括地级市、地区、自治州、盟。 服务实现类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Service
public class AqyAreaCityServiceImpl extends ServiceImpl<AqyAreaCityMapper, AqyAreaCity> implements AqyAreaCityService {

    @Autowired
    private AqyAreaCityMapper baseMapper;

    /**
     * 通过省级ID查询城市ID
     * */
    @Override
    public List<AqyAreaCity> getCityListByProvinceCode(String ProvinceCode) {

        return baseMapper.getCityListByProvinceCode(ProvinceCode);

    }
}
