/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.mall.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
        import java.math.BigDecimal;
    import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;

/**
 * 佣金详情表
 *
 * @author code generator
 * @date 2020-03-24 11:39:39
 */
@Data
@TableName("commission_record")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "佣金详情表")
public class CommissionRecord extends Model<CommissionRecord> {
    private static final long serialVersionUID=1L;

    /**
     * 佣金记录明细
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    /**
     * 订单号id
     */
    private String orderInfoId;
    /**
     * 用户id
     */
    private String userInfoId;
    /**
     * 返佣金额
     */
    private BigDecimal rebate;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;

}
