package com.geekbang.coupon.template.services;

import com.geekbang.coupon.template.api.beans.CouponTemplateInfo;
import com.geekbang.coupon.template.api.beans.PagedCouponTemplateInfo;
import com.geekbang.coupon.template.api.beans.TemplateSearchParams;

import java.util.Collection;
import java.util.Map;

/**
 * 优惠券模板接口
 * @author Jackie Hou
 */
public interface CouponTemplateService {
    /**
     * 创建优惠券模板
     * @param request
     * @return
     */
    CouponTemplateInfo createTemplate(CouponTemplateInfo request);

    /**
     * 通过id查询优惠券模板
     * @param id
     * @return
     */
    CouponTemplateInfo loadTemplateInfo(Long id);

    /**
     * 克隆
     * @param templateId
     * @return
     */
    CouponTemplateInfo cloneTemplate(Long templateId);


    /**
     * 删除
     * @param id
     */
    void deleteTemplate(Long id);

    /**
     * 批量读取模板
     * @param ids
     * @return
     */
    Map<Long, CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);

    /**
     * 分页查询
     * @param request
     * @return
     */
    PagedCouponTemplateInfo search(TemplateSearchParams request);
}
