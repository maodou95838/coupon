package com.geekbang.coupon2.template.dao.converter;

import com.alibaba.fastjson.JSON;
import com.geekbang.coupon2.template.api.rules.TemplateRule;

import javax.persistence.AttributeConverter;

public class RuleConverter implements AttributeConverter<TemplateRule, String> {
    @Override
    public String convertToDatabaseColumn(TemplateRule templateRule) {
        return JSON.toJSONString(templateRule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String s) {
        return JSON.parseObject(s, TemplateRule.class);
    }
}