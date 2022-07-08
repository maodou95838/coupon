package com.geekbang.coupon2.template.dao.entity;

import com.geekbang.coupon2.template.api.enums.CouponType;
import com.geekbang.coupon2.template.api.rules.TemplateRule;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "coupon_template")
@EntityListeners(AuditingEntityListener.class)
public class CouponTemplate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "available", nullable = false)
    private Boolean available;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    /**
     * 适用门店，如果为空，则为全店满减券
     */
    @Column(name = "shop_id")
    private Long shopId;


    @Column(name = "type", nullable = false)
    private CouponType category;

    @Column(name = "created_time", nullable = false)
    @CreatedDate
    private Date createTime;

    /**
     * 优惠券核算规则
     */
    @Column(name = "rule", nullable = false)
    private TemplateRule rule;
}
