package com.geekbang.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagedCouponTemplateInfo {

    private List<CouponTemplateInfo> templates;

    private int page;

    private long total;

}
