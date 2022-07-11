package com.geekbang.coupon.calculation.api.beans;

import com.geekbang.coupon2.template.api.beans.CouponInfo;

import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    private Long couponId;

    private List<CouponInfo> couponInfos;

    private Long cost;

    private Long userId;
}
