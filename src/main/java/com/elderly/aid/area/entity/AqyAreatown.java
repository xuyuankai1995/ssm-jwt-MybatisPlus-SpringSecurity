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
 * 地域表-四级乡级行政区：包括街道、镇、乡、民族乡、苏木、民族苏木、县辖区。
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_AreaTown")
public class AqyAreatown extends Model<AqyAreatown> {

    private static final long serialVersionUID = 1L;

    /**
     * 街道、镇地点主键
     */
    @TableId("TownID")
    private String TownID;

    /**
     * 街道、镇编码
     */
    @TableField("TownCode")
    private String TownCode;

    /**
     * 街道、镇名称
     */
    @TableField("TownName")
    private String TownName;

    /**
     * 区县编码
     */
    @TableField("CountryCode")
    private String CountryCode;

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
        return this.TownID;
    }

}
