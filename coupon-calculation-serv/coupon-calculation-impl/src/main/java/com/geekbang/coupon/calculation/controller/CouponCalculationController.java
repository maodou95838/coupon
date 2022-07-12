package com.geekbang.coupon.calculation.controller;

import com.alibaba.fastjson.JSON;
import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import com.geekbang.coupon.calculation.api.beans.SimulationOrder;
import com.geekbang.coupon.calculation.api.beans.SimulationResponse;
import com.geekbang.coupon.calculation.controller.service.intf.CouponCalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/calculator")
public class CouponCalculationController {

    @PostMapping("/checkout")
    @ResponseBody
    public ShoppingCart calculationOrderPrice(@RequestBody ShoppingCart cart) {
        log.info("do calculation: {}", JSON.toJSONString(cart));
        return couponCalculationService.calculateOrderPrice(cart);
    }

    @PostMapping("/simulate")
    @ResponseBody
    public SimulationResponse simulate(@RequestBody SimulationOrder order) {
        log.info("do simulation: {}", JSON.toJSONString(order));
        return couponCalculationService.simulateOrder(order);
    }

    @Autowired
    private CouponCalculationService couponCalculationService;
}
