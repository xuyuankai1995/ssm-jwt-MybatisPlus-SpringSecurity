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
 * 系统表-组织机构领导表
作用：为组织机构领导的用户可以查看旗下所有组织、部门的数据
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_SysDepartmentLearder")
public class AqySysdepartmentlearder extends Model<AqySysdepartmentlearder> {

    private static final long serialVersionUID = 1L;

    /**
     * 站点部门领导表主键
     */
    @TableId("DepartmentLearderID")
    private String DepartmentLearderID;

    /**
     * 站点部门ID
     */
    @TableField("DepartmentID")
    private String DepartmentID;

    /**
     * 用户ID
     */
    @TableField("UserID")
    private String UserID;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 删除标识
     */
    @TableField("DeleteFlag")
    private Boolean DeleteFlag;

    /**
     * 删除者
     */
    @TableField("DeleteBy")
    private String DeleteBy;

    /**
     * 删除时间
     */
    @TableField("DeleteTime")
    private LocalDateTime DeleteTime;


    @Override
    protected Serializable pkVal() {
        return this.DepartmentLearderID;
    }

}
