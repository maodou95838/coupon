package com.geekbang.coupon.calculation.api.beans;

import com.geekbang.coupon.template.api.beans.CouponInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 价格试算
 * @author Jackie Hou
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulationOrder {

    private List<Product> products;


    private List<Long> couponIds;


    private List<CouponInfo> couponInfos;


    private Long userId;
}
