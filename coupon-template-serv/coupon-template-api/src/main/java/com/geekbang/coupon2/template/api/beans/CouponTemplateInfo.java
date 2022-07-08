package com.geekbang.coupon2.template.api.beans;

import com.geekbang.coupon2.template.api.rules.TemplateRule;

public class CouponTemplateInfo {

    private Long id;

    //优惠券名称
    private String name;

    private String desc;

    //优惠券类型，引用CouponType
    private String type;

    //适用的门店
    private Long shopId;

    //适用规则
    private TemplateRule rule;

    //该模板是否有效
    private Boolean available;
}
