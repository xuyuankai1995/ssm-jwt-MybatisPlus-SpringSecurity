package com.elderly.aid.area.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 区域表-一级省级行政区：包括省、自治区、直辖市、特别行政区；
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_AreaProvince")
public class AqyAreaprovince extends Model<AqyAreaprovince> {

    private static final long serialVersionUID = 1L;

    /**
     * 省ID
     */
    @TableId("ProvinceID")
    private String ProvinceID;

    /**
     * 省编码
     */
    @TableField("ProvinceCode")
    private String ProvinceCode;

    /**
     * 省名称
     */
    @TableField("ProvinceName")
    private String ProvinceName;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("ModifyTime")
    private LocalDateTime ModifyTime;

    /**
     * 删除标识
     */
    @TableField("DeleteFlag")
    private Boolean DeleteFlag;

    /**
     * 删除人
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
        return this.ProvinceID;
    }

}
