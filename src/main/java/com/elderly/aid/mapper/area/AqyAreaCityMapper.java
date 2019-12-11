package com.elderly.aid.mapper.area;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.entity.area.AqyAreaCity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 地域表-二级地级行政区：包括地级市、地区、自治州、盟。 Mapper 接口
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Component(value = "AqyAreaCityMapper")
@Mapper
public interface AqyAreaCityMapper extends BaseMapper<AqyAreaCity> {

    /**
     * 通过省级ID查询城市ID
     * */
    List<AqyAreaCity> getCityListByProvinceCode(String ProvinceCode);
}
