package com.geekbang.coupon2.template.api.enums;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum CouponType {
    UNKONWN("unknown", "0"),
    MONEY_OFF("满减券", "1"),
    DISCOUNT("打折","2"),
    RANDOM_DISCOUNT("随机减", "3"),
    LONELY_NIGHT_MONEY_OFF("晚间双倍优惠券", "4");

    private String description;

    private String code;

    public static CouponType convert(String code) {
        return Stream.of(values())
                .filter(bean -> bean.code.equalsIgnoreCase(code))
                .findFirst()
                .orElse(UNKONWN);
    }
}
