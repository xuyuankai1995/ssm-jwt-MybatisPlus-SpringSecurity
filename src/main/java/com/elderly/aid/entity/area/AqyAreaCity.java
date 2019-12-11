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
 * 地域表-二级地级行政区：包括地级市、地区、自治州、盟。
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_AreaCity")
public class AqyAreaCity extends Model<AqyAreaCity> {

    private static final long serialVersionUID = 1L;

    /**
     * 地域城市表主键
     */
    @TableId("CityID")
    private String CityID;

    /**
     * 城市编码
     */
    @TableField("CityCode")
    private String CityCode;

    /**
     * 城市名称
     */
    @TableField("CityName")
    private String CityName;

    /**
     * 省编码
     */
    @TableField("ProvinceCode")
    private String ProvinceCode;

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
        return this.CityID;
    }

}
