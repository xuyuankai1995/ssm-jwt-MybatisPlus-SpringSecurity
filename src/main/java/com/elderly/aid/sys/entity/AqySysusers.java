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
 * 系统表-用户表
作用：记录用户基础信息数据，含名称、账号、密码等数据信息
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_SysUsers")
public class AqySysusers extends Model<AqySysusers> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键ID
     */
    @TableId("UserID")
    private String UserID;

    /**
     * 用户账户（最多25个字符）
     */
    @TableField("Account")
    private String Account;

    /**
     * 用户密码盐
     */
    @TableField("Salt")
    private String Salt;

    /**
     * 用户密码
     */
    @TableField("Password")
    private String Password;

    /**
     * 用户名称
     */
    @TableField("UserName")
    private String UserName;

    /**
     * 手机号码
     */
    @TableField("MobileNumber")
    private String MobileNumber;

    /**
     * 照片头像
     */
    @TableField("Photo")
    private String Photo;

    /**
     * 性别
     */
    @TableField("Sex")
    private Boolean Sex;

    /**
     * 是否admin管理员
     */
    @TableField("IsAdministrator")
    private Boolean IsAdministrator;

    /**
     * 是否组织管理员账户
     */
    @TableField("IsOrganizationLeader")
    private Boolean IsOrganizationLeader;

    /**
     * 职务ID
     */
    @TableField("PositionID")
    private String PositionID;

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
     * 组织机构
     */
    @TableField("OrganizationID")
    private String OrganizationID;

    /**
     * 部门
     */
    @TableField("DepartmentID")
    private String DepartmentID;

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
        return this.UserID;
    }

}
