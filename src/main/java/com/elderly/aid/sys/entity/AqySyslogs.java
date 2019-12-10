package com.elderly.aid.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统表-日志管理表
作用：记录系统操作基础日志数据，记录【业务流程】基础数据
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_SysLogs")
public class AqySyslogs extends Model<AqySyslogs> {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    @TableId("LogID")
    private String LogID;

    /**
     * 操作消息
     */
    @TableField("Message")
    private String Message;

    /**
     * 结果
     */
    @TableField("Result")
    private String Result;

    /**
     * 操作内容
     */
    @TableField("Content")
    private String Content;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 创建者
     */
    @TableField("CreateBy")
    private String CreateBy;


    @Override
    protected Serializable pkVal() {
        return this.LogID;
    }

}
