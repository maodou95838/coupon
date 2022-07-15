package com.geekbang.coupon.customer.feign;

import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import com.geekbang.coupon.calculation.api.beans.SimulationOrder;
import com.geekbang.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "coupon-calculation-serv", path = "/calculator")
public interface CalculationService {

    /**
     * 结算
     * @param settlement
     * @return
     */
    @PostMapping("/checkout")
    ShoppingCart checkout(ShoppingCart settlement);


    /**
     *  优惠券试算
     * @param simulator
     * @return
     */
    @PostMapping("/simulate")
    SimulationResponse simulate(SimulationOrder simulator);
}
