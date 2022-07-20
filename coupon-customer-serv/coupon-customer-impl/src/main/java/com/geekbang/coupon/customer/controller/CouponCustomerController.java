package com.geekbang.coupon.customer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import com.geekbang.coupon.calculation.api.beans.SimulationOrder;
import com.geekbang.coupon.calculation.api.beans.SimulationResponse;
import com.geekbang.coupon.customer.api.beans.RequestCoupon;
import com.geekbang.coupon.customer.api.beans.SearchCoupon;
import com.geekbang.coupon.customer.dao.entity.Coupon;
import com.geekbang.coupon.customer.service.intf.CouponCustomerService;
import com.geekbang.coupon.template.api.beans.CouponInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 客户controller
 */
@Slf4j
@RestController
@RequestMapping("coupon-customer")
@RefreshScope
public class CouponCustomerController {

    @Value(("${disableCouponRequest:false}"))
    private Boolean disableCoupon;

    @Autowired
    private CouponCustomerService customerService;

    /**
     * 领券，实际是从模板生成一个优惠券，并和用户关联
     * @param request
     * @return
     */
    @PostMapping("requestCoupon")
    @SentinelResource(value = "requestCoupon")
    public Coupon requestCoupon(@RequestBody RequestCoupon request) {
        if (disableCoupon) {
            log.info("暂停领券");
            return null;
        }
        return customerService.requestCoupon(request);
    }


    /**
     * 用户删除优惠券
     * @param userId
     * @param couponId
     */
    @DeleteMapping("deleteCoupon")
    public void deleteCoupon(@RequestParam("userId") Long userId,
                                       @RequestParam("couponId") Long couponId) {
        customerService.deleteCoupon(userId, couponId);
    }

    /**
     * 用户模拟计算每个优惠券的优惠价格
     * @param order
     * @return
     */
    @PostMapping("simulateOrder")
    public SimulationResponse simulate( @RequestBody SimulationOrder order) {
        return customerService.simulateOrderPrice(order);
    }


    /**
     * 核销
     * @param info
     * @return
     */
    @PostMapping("placeOrder")
    public ShoppingCart checkout( @RequestBody ShoppingCart info) {
        return customerService.placeOrder(info);
    }


    /**
     * 实现的时候最好封装一个search object类
     * @param request
     * @return
     */
    @PostMapping("findCoupon")
    @SentinelResource(value = "cuntomer-findCoupon")
    public List<CouponInfo> findCoupon(@RequestBody SearchCoupon request) {
        return customerService.findCoupon(request);
    }

}
