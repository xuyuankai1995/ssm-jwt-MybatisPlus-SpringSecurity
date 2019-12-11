package com.elderly.aid.mapper.area;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.entity.area.AqyAreaVillage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 地域表-五级村级行政区：包括村、社区、连等单位 Mapper 接口
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Component("AqyAreaVillageMapper")
@Mapper
public interface AqyAreaVillageMapper extends BaseMapper<AqyAreaVillage> {

}
