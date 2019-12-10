package com.elderly.aid.area.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderly.aid.area.entity.AqyAreacity;
import com.elderly.aid.area.mapper.AqyAreacityMapper;
import com.elderly.aid.area.service.AqyAreacityService;
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
public class AqyAreacityServiceImpl extends ServiceImpl<AqyAreacityMapper, AqyAreacity> implements AqyAreacityService {

    @Autowired
    private AqyAreacityMapper baseMapper;

    /**
     * 通过省级ID查询城市ID
     * */
    @Override
    public List<AqyAreacity> getCityListByProvinceCode(String ProvinceCode) {

        return baseMapper.getCityListByProvinceCode(ProvinceCode);

    }
}
