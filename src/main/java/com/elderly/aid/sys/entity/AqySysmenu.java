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
 * 系统表-菜单管理表
作用：用于对于菜单的管理与应用
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_SysMenu")
public class AqySysmenu extends Model<AqySysmenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单主键ID
     */
    @TableId("MenuID")
    private String MenuID;

    /**
     * 菜单名称
     */
    @TableField("MenuName")
    private String MenuName;

    /**
     * 上级菜单ID，无上级写0
     */
    @TableField("MenuParentID")
    private String MenuParentID;

    /**
     * URL
     */
    @TableField("Url")
    private String Url;

    /**
     * 图标
     */
    @TableField("Iconic")
    private String Iconic;

    /**
     * 排序
     */
    @TableField("Sort")
    private Integer Sort;

    /**
     * 描述
     */
    @TableField("Description")
    private String Description;

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
        return this.MenuID;
    }

}
