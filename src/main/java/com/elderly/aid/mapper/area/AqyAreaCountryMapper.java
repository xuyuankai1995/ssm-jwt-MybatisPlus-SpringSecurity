package com.elderly.aid.mapper.area;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.entity.area.AqyAreaCountry;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 地域表-三级县级行政区：包括市辖区、县级市、县、自治县、旗、自治旗、林区、特区。 Mapper 接口
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Component("AqyAreaCountryMapper")
@Mapper
public interface AqyAreaCountryMapper extends BaseMapper<AqyAreaCountry> {

}
