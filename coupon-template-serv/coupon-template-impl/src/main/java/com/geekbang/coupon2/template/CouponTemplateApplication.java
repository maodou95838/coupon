package com.geekbang.coupon2.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CouponTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponTemplateApplication.class, args);
    }
}
