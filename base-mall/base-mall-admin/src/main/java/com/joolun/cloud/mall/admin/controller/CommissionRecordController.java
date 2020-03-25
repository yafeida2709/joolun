/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.mall.admin.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joolun.cloud.common.core.util.R;
import com.joolun.cloud.common.log.annotation.SysLog;
import com.joolun.cloud.mall.common.entity.CommissionRecord;
import com.joolun.cloud.mall.admin.service.CommissionRecordService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;

/**
 * 佣金详情表
 *
 * @author code generator
 * @date 2020-03-24 11:39:39
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/commissionrecord")
@Api(value = "commissionrecord", tags = "佣金详情表管理")
public class CommissionRecordController {

    private final CommissionRecordService commissionRecordService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param commissionRecord 佣金详情表
     * @return
     */
    @GetMapping("/page")
    @PreAuthorize("@ato.hasAuthority('mall_commissionrecord_index')")
    public R getPage(Page page, CommissionRecord commissionRecord) {
        return R.ok(commissionRecordService.page(page, Wrappers.query(commissionRecord)));
    }

    /**
     * 佣金详情表查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    @PreAuthorize("@ato.hasAuthority('mall_commissionrecord_get')")
    public R getById(@PathVariable("id") String id) {
        return R.ok(commissionRecordService.getById(id));
    }

    /**
     * 佣金详情表新增
     * @param commissionRecord 佣金详情表
     * @return R
     */
    @SysLog("新增佣金详情表")
    @PostMapping
    @PreAuthorize("@ato.hasAuthority('mall_commissionrecord_add')")
    public R save(@RequestBody CommissionRecord commissionRecord) {
        return R.ok(commissionRecordService.save(commissionRecord));
    }

    /**
     * 佣金详情表修改
     * @param commissionRecord 佣金详情表
     * @return R
     */
    @SysLog("修改佣金详情表")
    @PutMapping
    @PreAuthorize("@ato.hasAuthority('mall_commissionrecord_edit')")
    public R updateById(@RequestBody CommissionRecord commissionRecord) {
        return R.ok(commissionRecordService.updateById(commissionRecord));
    }

    /**
     * 佣金详情表删除
     * @param id
     * @return R
     */
    @SysLog("删除佣金详情表")
    @DeleteMapping("/{id}")
    @PreAuthorize("@ato.hasAuthority('mall_commissionrecord_del')")
    public R removeById(@PathVariable String id) {
        return R.ok(commissionRecordService.removeById(id));
    }

}
