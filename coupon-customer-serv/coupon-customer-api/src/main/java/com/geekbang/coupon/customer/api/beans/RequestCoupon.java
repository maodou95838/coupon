package com.geekbang.coupon.customer.api.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCoupon {

    private Long userId;

    private Long couponTemplateId;
}
