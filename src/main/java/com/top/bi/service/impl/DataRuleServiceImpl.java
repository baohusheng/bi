package com.top.bi.service.impl;

import com.top.bi.dao.DataRuleDao;
import com.top.bi.entity.DataRule;
import com.top.bi.service.DataRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class DataRuleServiceImpl implements DataRuleService {
    @Resource
    private DataRuleDao dataRuleDao;
    @Override
    public List<Map<String, Object>> SelectDataRule(DataRule dateRule, Integer page, Integer rows) {
        return dataRuleDao.SelectDataRule(dateRule,page,rows);
    }

    @Override
    public int getCount(DataRule dateRule) {
        return dataRuleDao.getCount(dateRule);
    }

    @Override
    public void updateRule(DataRule dateRule) {
        dataRuleDao.updateRule(dateRule);
    }

    @Override
    public List<Map<String, Object>> getXt(DataRule dateRule) {
        return dataRuleDao.getXt(dateRule);
    }

    @Override
    public void addDataRule(DataRule dataRule) {
        dataRuleDao.addDataRule(dataRule);
    }

    @Override
    public void deleted(DataRule dataRule) {
        dataRuleDao.deleted(dataRule);
    }

    @Override
    public List<Map<String, Object>> getModule() {
        return dataRuleDao.getModule();
    }
}
