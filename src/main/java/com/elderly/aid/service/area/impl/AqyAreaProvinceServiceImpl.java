package com.elderly.aid.service.area.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderly.aid.entity.area.AqyAreaProvince;
import com.elderly.aid.mapper.area.AqyAreaProvinceMapper;
import com.elderly.aid.service.area.AqyAreaProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 区域表-一级省级行政区：包括省、自治区、直辖市、特别行政区； 服务实现类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Service
public class AqyAreaProvinceServiceImpl extends ServiceImpl<AqyAreaProvinceMapper, AqyAreaProvince> implements AqyAreaProvinceService {

    @Autowired
    private AqyAreaProvinceMapper aqyAreaProvinceMapper;

    /**
     * 查询所有省级名称
     * */
    @Override
    public List<AqyAreaProvince> getAllProvinceByName(String keyword) {
        return aqyAreaProvinceMapper.getAllProvinceByName(keyword);
    }

    /**
     * 分页查询所有省级名称
     * */
    @Override
    public List<AqyAreaProvince> pageAllProvinceByName(String keyword, int pageCount, int pageSize) {
        return aqyAreaProvinceMapper.pageAllProvinceByName(keyword, pageCount, pageSize);
    }

    /**
     * 查询所有省级单位总数量
     * */
    @Override
    public int getAllProvinceCountByName(String keyword) {
        return aqyAreaProvinceMapper.getAllProvinceCountByName(keyword);
    }
}
