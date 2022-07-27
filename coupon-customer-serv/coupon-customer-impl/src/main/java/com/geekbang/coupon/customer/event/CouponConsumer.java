package com.geekbang.coupon.customer.event;

import com.geekbang.coupon.customer.service.intf.CouponCustomerService;
import com.rabbitmq.client.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CouponConsumer {

//    @Autowired
//    private CouponCustomerService customerService;
//
//    @Bean
//    public Consumer addCoupon() {
//        return request -> {
//            log.info("received: {}", request);
//            customerService.requestCoupon(request);
//        };
//
//    }
//
//    @Bean
//    public Consumer deleteCoupon() {
//        return request -> {
//            log.info("received: {}", request);
//            List params = Arrays.stream(request.split(",")).map(Long::valueOf).collect(Collectors.toList());
//            customerService.deleteCoupon(params.get(0), params.get(1));
//        };
//    }
}
