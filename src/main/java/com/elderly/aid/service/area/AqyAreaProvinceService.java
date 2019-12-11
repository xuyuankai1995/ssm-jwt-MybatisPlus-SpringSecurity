package com.elderly.aid.service.area;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderly.aid.entity.area.AqyAreaProvince;

import java.util.List;

/**
 * <p>
 * 区域表-一级省级行政区：包括省、自治区、直辖市、特别行政区； 服务类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
public interface AqyAreaProvinceService extends IService<AqyAreaProvince> {
    /**
     * 查询所有省级名称
     * */
    List<AqyAreaProvince> getAllProvinceByName(String keyword);


    /**
     * 分页查询所有省级名称
     * */
    List<AqyAreaProvince> pageAllProvinceByName(String keyword,int pageCount,int pageSize);


    /**
     * 查询所有省级单位总数量
     * */
    int getAllProvinceCountByName(String keyword);
}
