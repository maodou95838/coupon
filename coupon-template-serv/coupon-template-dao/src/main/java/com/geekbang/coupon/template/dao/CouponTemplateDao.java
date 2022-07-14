package com.geekbang.coupon.template.dao;

import com.geekbang.coupon.template.dao.entity.CouponTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CouponTemplateDao extends JpaRepository<CouponTemplate, Long> {

    /**
     * 根据shopId 查询所有优惠券模板
     * @param shopId
     * @return
     */
    List<CouponTemplate> findAllByShopId(Long shopId);

    /**
     * In查询， 支持分页
     * @param id
     * @param page
     * @return
     */
    Page<CouponTemplate> findAllByIdIn(List<Long> id, Pageable page);

    /**
     * 根据shopId 和可用状态查询
     * @param shopId
     * @param available
     * @return
     */
    Integer countByShopIdAndAvailable(Long shopId, Boolean available);

    /**
     * 将优惠券设为不可用
     * @param id
     * @return
     */
    @Modifying
    @Query("update CouponTemplate c set c.available = 0 where c.id = :id")
    int makeCouponUnavailable(@Param("id") Long id);
}
