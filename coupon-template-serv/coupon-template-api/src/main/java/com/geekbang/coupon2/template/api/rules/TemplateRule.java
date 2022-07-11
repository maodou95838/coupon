package com.geekbang.coupon2.template.api.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 领券规则，每个用户的可领取数量和模板过期时间
 * @author Jackie Hou
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {

    /**
     * 每个人最多可以领券数量
     */
    private Integer limitation;

    /**
     * 可以享受的折扣
     */
    private Discount discount;

    /**
     * 过期时间
     */
    private Long deadline;
}
