package com.elderly.aid.entity.area;

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
 * 地域表-三级县级行政区：包括市辖区、县级市、县、自治县、旗、自治旗、林区、特区。
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_AreaCountry")
public class AqyAreaCountry extends Model<AqyAreaCountry> {

    private static final long serialVersionUID = 1L;

    /**
     * 县级、区市ID
     */
    @TableId("CountryID")
    private String CountryID;

    /**
     * 编码
     */
    @TableField("CountryCode")
    private String CountryCode;

    /**
     * 名称
     */
    @TableField("CountryName")
    private String CountryName;

    /**
     * 城市编码
     */
    @TableField("CityCode")
    private String CityCode;

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
        return this.CountryID;
    }

}
