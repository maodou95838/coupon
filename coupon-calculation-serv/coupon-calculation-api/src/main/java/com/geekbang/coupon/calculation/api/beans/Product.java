package com.geekbang.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    /**
     * 数量
     */
    private Integer count;

    /**
     * 门店id
     */
    private Long shopId;

    private Long price;
}
