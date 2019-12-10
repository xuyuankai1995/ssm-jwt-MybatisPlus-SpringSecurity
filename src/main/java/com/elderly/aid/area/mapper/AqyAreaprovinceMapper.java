package com.elderly.aid.area.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.area.entity.AqyAreacity;
import com.elderly.aid.area.entity.AqyAreaprovince;

import java.util.List;

/**
 * <p>
 * 区域表-一级省级行政区：包括省、自治区、直辖市、特别行政区； Mapper 接口
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
public interface AqyAreaprovinceMapper extends BaseMapper<AqyAreaprovince> {
    /**
     * 查询省级ID
     * */
    List<AqyAreaprovince> getProvinceList();
}
