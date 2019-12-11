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
 * 地域表-五级村级行政区：包括村、社区、连等单位
 * </p>
 *
 * @author xuyuankai
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Aqy_AreaVillage")
public class AqyAreaVillage extends Model<AqyAreaVillage> {

    private static final long serialVersionUID = 1L;

    /**
     * 村、社区地点主键
     */
    @TableId("VillageID")
    private String VillageID;

    /**
     * 村、社区编码
     */
    @TableField("VillageCode")
    private String VillageCode;

    /**
     * 村、社区名称
     */
    @TableField("VillageName")
    private String VillageName;

    /**
     * 街道、镇编码
     */
    @TableField("TownCode")
    private String TownCode;

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
        return this.VillageID;
    }

}
