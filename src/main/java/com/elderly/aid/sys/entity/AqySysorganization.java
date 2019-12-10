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
 * 系统表-组织机构表
作用：用于对组织机构进行管理
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_SysOrganization")
public class AqySysorganization extends Model<AqySysorganization> {

    private static final long serialVersionUID = 1L;

    /**
     * 组织机构ID
     */
    @TableId("OrganizationID")
    private String OrganizationID;

    /**
     * 组织名称
     */
    @TableField("OrganizationName")
    private String OrganizationName;

    /**
     * 联系电话
     */
    @TableField("Phone")
    private String Phone;

    /**
     * 组织地址
     */
    @TableField("Address")
    private String Address;

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
        return this.OrganizationID;
    }

}
