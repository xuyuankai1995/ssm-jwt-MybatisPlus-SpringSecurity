package com.elderly.aid.area.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.area.entity.AqyAreacity;
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
@Component(value = "AqyAreacityMapper")
@Mapper
public interface AqyAreacityMapper extends BaseMapper<AqyAreacity> {

    /**
     * 通过省级ID查询城市ID
     * */
    List<AqyAreacity> getCityListByProvinceCode(String ProvinceCode);
}
