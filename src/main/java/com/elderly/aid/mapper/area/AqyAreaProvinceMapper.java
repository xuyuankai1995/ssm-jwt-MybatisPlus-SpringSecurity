package com.elderly.aid.mapper.area;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderly.aid.entity.area.AqyAreaProvince;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 区域表-一级省级行政区：包括省、自治区、直辖市、特别行政区； Mapper 接口
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Component("AqyAreaProvinceMapper")
@Mapper
public interface AqyAreaProvinceMapper extends BaseMapper<AqyAreaProvince> {
    /**
     * 查询所有省级名称
     * */
    List<AqyAreaProvince> getAllProvinceByName(@Param("keyword")String keyword);


    /**
     * 分页查询所有省级名称
     * */
    List<AqyAreaProvince> pageAllProvinceByName(@Param("keyword")String keyword,@Param("pageCount")int pageCount,@Param("pageSize")int pageSize);


    /**
     * 查询所有省级单位总数量
     * */
    int getAllProvinceCountByName(@Param("keyword")String keyword);
}
