package com.top.bi.service;

import com.top.bi.entity.DataRule;

import java.util.List;
import java.util.Map;

public interface DataRuleService {
    List<Map<String, Object>> SelectDataRule(DataRule dateRule, Integer page, Integer rows);

    int getCount(DataRule dateRule);

    void updateRule(DataRule dateRule);

    List<Map<String, Object>> getXt(DataRule dateRule);

    void addDataRule(DataRule dataRule);

    void deleted(DataRule dataRule);

    List<Map<String, Object>> getModule();
}
