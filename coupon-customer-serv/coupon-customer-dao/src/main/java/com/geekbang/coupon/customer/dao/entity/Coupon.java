package com.geekbang.coupon.customer.dao.entity;

import com.geekbang.coupon.customer.api.enums.CouponStatus;
import com.geekbang.coupon.customer.dao.convertor.CouponStatusConverter;
import com.geekbang.coupon.template.api.beans.CouponTemplateInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "coupon")
@EntityListeners(AuditingEntityListener.class)
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "template_id", nullable = false)
    private Long templateId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "shop_id")
    private Long shopId;

    @CreatedDate
    @Column(name = "created_time", nullable = false)
    private Date createdTime;

    @Column(name = "status", nullable = false)
    @Convert(converter = CouponStatusConverter.class)
    private CouponStatus status;

    @Transient
    private CouponTemplateInfo templateInfo;
}
