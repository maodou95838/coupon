package com.geekbang.coupon2.template.impl.converter;


import com.geekbang.coupon2.template.api.beans.CouponTemplateInfo;
import com.geekbang.coupon2.template.dao.entity.CouponTemplate;

public class CouponTemplateConverter {

    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}