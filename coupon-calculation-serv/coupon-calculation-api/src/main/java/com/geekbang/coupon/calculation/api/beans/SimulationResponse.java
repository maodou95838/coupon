package com.geekbang.coupon.calculation.api.beans;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 订单试算结果
 */
@Data
@NoArgsConstructor
public class SimulationResponse {

    /**
     * 最省钱的
     */
    private Long bestCouponId;

    /**
     *每一个优惠券对应的订单价格
     */
    private Map<Long, Long> coupon2OrderPrice = Maps.newHashMap();
}
