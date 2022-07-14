package com.geekbang.coupon.calculation.api.beans;

import com.geekbang.coupon.template.api.beans.CouponInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 购物车
 * @author Jackie Hou
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    private List<Product> products;

    private Long couponId;

    private List<CouponInfo> couponInfos;

    private Long cost;

    private Long userId;
}
