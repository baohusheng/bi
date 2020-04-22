package com.top.bi.controller;

import com.top.bi.entity.DataRule;
import com.top.bi.service.DataRuleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DataRuleController {
    @Resource
    private DataRuleService dataRuleService;
    @RequestMapping("/dataRule")
    public String DataRule(){
        return "/src/main/resources/static/dataRule.html";
    }
    @RequestMapping("/getDataRule")
    @ResponseBody
    public Map<String, Object> getDataRule(DataRule dateRule,Integer page,Integer rows){
        page=(page==null||page==0)?1:page;
        rows=(rows==null||rows==0)?15:rows;
        List<Map<String, Object>> list=dataRuleService.SelectDataRule(dateRule,page,rows);
        Map<String, Object> ma=new HashMap<String, Object>();
        int total=dataRuleService.getCount(dateRule);
        ma.put("total",total);
        ma.put("rows", list);
        return ma;
    }
    @RequestMapping("updateRule")
    @ResponseBody
    public void updateRule(DataRule dateRule){
        dataRuleService.updateRule(dateRule);
    }
    @RequestMapping("getXt")
    @ResponseBody
    public List<Map<String,Object>> getXt(DataRule dateRule){
        return dataRuleService.getXt(dateRule);
    }
    @RequestMapping("getModule")
    @ResponseBody
    public List<Map<String,Object>> getModule(){

        return dataRuleService.getModule();
    }
    @RequestMapping("addDataRule")
    @ResponseBody
    public void addDataRule(DataRule dataRule){
        dataRuleService.addDataRule(dataRule);
    }
    @RequestMapping("deleted")
    @ResponseBody
    public void deleted(DataRule dataRule){
        dataRuleService.deleted(dataRule);
    }
}
