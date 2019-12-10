package com.elderly.aid.area.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderly.aid.area.entity.AqyAreacountry;
import com.elderly.aid.area.mapper.AqyAreacountryMapper;
import com.elderly.aid.area.service.AqyAreacountryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地域表-三级县级行政区：包括市辖区、县级市、县、自治县、旗、自治旗、林区、特区。 服务实现类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Service
public class AqyAreacountryServiceImpl extends ServiceImpl<AqyAreacountryMapper, AqyAreacountry> implements AqyAreacountryService {

}
