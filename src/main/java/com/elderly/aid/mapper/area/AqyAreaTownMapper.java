package com.elderly.aid.mapper.area;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.entity.area.AqyAreaTown;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 地域表-四级乡级行政区：包括街道、镇、乡、民族乡、苏木、民族苏木、县辖区。 Mapper 接口
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Component("AqyAreaTownMapper")
@Mapper
public interface AqyAreaTownMapper extends BaseMapper<AqyAreaTown> {

}
