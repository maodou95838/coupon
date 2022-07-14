package com.geekbang.coupon.calculation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CalculationApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(CalculationApplication.class, args);
        } catch (Exception e) {
            log.debug(e.toString());
            e.printStackTrace();
        }
    }
}