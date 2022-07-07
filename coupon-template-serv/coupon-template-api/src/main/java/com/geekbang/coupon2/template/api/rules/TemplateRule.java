package com.geekbang.coupon2.template.api.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {

    private Integer limitation;

    private Discount discount;

    private Long deadline;
}
