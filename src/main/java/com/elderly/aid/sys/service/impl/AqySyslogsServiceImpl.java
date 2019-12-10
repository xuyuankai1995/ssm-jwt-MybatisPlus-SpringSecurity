package com.elderly.aid.sys.service.impl;

import com.elderly.aid.sys.entity.AqySyslogs;
import com.elderly.aid.sys.mapper.AqySyslogsMapper;
import com.elderly.aid.sys.service.AqySyslogsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统表-日志管理表
作用：记录系统操作基础日志数据，记录【业务流程】基础数据 服务实现类
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Service
public class AqySyslogsServiceImpl extends ServiceImpl<AqySyslogsMapper, AqySyslogs> implements AqySyslogsService {

}
