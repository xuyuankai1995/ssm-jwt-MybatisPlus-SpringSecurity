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
 * 系统表-部门管理表
作用：用于部门和站点的管理
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_SysDepartment")
public class AqySysdepartment extends Model<AqySysdepartment> {

    private static final long serialVersionUID = 1L;

    /**
     * 部门ID
     */
    @TableId("DepartmentID")
    private String DepartmentID;

    /**
     * 部门名称
     */
    @TableField("DepartmentName")
    private String DepartmentName;

    /**
     * 描述
     */
    @TableField("Description")
    private String Description;

    /**
     * 上级部门ID
     */
    @TableField("FatherDepartmentID")
    private String FatherDepartmentID;

    /**
     * 经度位置
     */
    @TableField("Lat")
    private Double Lat;

    /**
     * 纬度位置
     */
    @TableField("Lng")
    private Double Lng;

    /**
     * 部门类型（0：部门 1：站点）
     */
    @TableField("DepartmentType")
    private Integer DepartmentType;

    /**
     * 组织机构
     */
    @TableField("OrganizationID")
    private String OrganizationID;

    /**
     * 启用标识
     */
    @TableField("Enable")
    private Boolean Enable;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 创建人
     */
    @TableField("CreateBy")
    private String CreateBy;

    /**
     * 修改时间
     */
    @TableField("ModifyTime")
    private LocalDateTime ModifyTime;

    /**
     * 修改人
     */
    @TableField("ModifyBy")
    private String ModifyBy;

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
        return this.DepartmentID;
    }

}
