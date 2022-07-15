package com.geekbang.coupon.customer;

import com.geekbang.coupon.customer.loadbalance.CanaryRuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {"com.geekbang"})
@EnableJpaRepositories(basePackages = {"com.geekbang"})
@EnableTransactionManagement
//@LoadBalancerClient(value = "coupon-template-serv", configuration = CanaryRuleConfiguration.class)
@EnableFeignClients(basePackages = {"com.geekbang"})
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
