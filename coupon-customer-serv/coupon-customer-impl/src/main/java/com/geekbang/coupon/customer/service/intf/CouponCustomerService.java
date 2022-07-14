package com.geekbang.coupon.customer.service.intf;

import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import com.geekbang.coupon.calculation.api.beans.SimulationOrder;
import com.geekbang.coupon.calculation.api.beans.SimulationResponse;
import com.geekbang.coupon.customer.api.beans.RequestCoupon;
import com.geekbang.coupon.customer.api.beans.SearchCoupon;
import com.geekbang.coupon.customer.dao.entity.Coupon;
import com.geekbang.coupon.template.api.beans.CouponInfo;

import java.util.List;

public interface CouponCustomerService {

    /**
     * 领券
     * @param request
     * @return
     */
    Coupon requestCoupon(RequestCoupon request);

    /**
     * 核销优惠券
     * @param info
     * @return
     */
    ShoppingCart placeOrder(ShoppingCart info);

    /**
     * 优惠券金额试算
     * @param order
     * @return
     */
    SimulationResponse simulateOrderPrice(SimulationOrder order);

    /**
     * 删除个人优惠券
     * @param userId
     * @param couponId
     */
    void deleteCoupon(Long userId, Long couponId);

    /**
     * 查询用户优惠券
     * @param request
     * @return
     */
    List<CouponInfo> findCoupon(SearchCoupon request);
}
