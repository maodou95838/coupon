package com.geekbang.coupon2.template.impl.controllers;

import com.geekbang.coupon2.template.api.beans.CouponTemplateInfo;
import com.geekbang.coupon2.template.dao.entity.CouponTemplate;
import com.geekbang.coupon2.template.impl.services.CouponTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/template")
public class CouponTemplateController {

    @PostMapping("/addTemplate")
    public CouponTemplateInfo addTemplate(@RequestBody CouponTemplateInfo request) {
        log.info("Create coupon template: data = {}", request);
        return couponTemplateService.createTemplate(request);
    }


    @PostMapping("/findById")
    public CouponTemplateInfo findTemplateById(@RequestParam("id") Long id) {
        log.info("Find coupon template: data = {}", id);
        return couponTemplateService.loadTemplateInfo(id);
    }

    @Autowired
    private CouponTemplateService couponTemplateService;

}
