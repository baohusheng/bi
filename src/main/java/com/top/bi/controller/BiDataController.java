package com.top.bi.controller;

import com.top.bi.entity.BiData;
import com.top.bi.service.BiDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class BiDataController {
    @Resource
    private BiDataService biDataService;
    @RequestMapping("/bi")
    public String see(){
        return "hello";
    }

    @RequestMapping("bidata")
    @ResponseBody
   public Map<String, Object> biData(BiData bidata,Integer page,Integer rows){
        page=(page==null||page==0)?1:page;
        rows=(rows==null||rows==0)?15:rows;
        List<Map<String, Object>> list=biDataService.SelectBiDataList(bidata,page,rows);
       /* System.out.println(bidata.getCheck_date());
        System.out.println(bidata.getEnd_date());*/
        Map<String, Object> ma=new HashMap<String, Object>();
        int total=biDataService.getCount(bidata);
        ma.put("total",total);
        ma.put("rows", list);
        return ma;
    }
    @RequestMapping("updateData")
    @ResponseBody
    public void updateData(BiData bidata){
        biDataService.updateData(bidata);
    }
    @RequestMapping("getState")
    @ResponseBody
    public List<Map<String,Object>> getState(){

        return biDataService.getState();
    }
    @RequestMapping("getPos")
    @ResponseBody
    public List<Map<String,Object>> getPos(BiData biData){
        System.out.println(biDataService.getPos(biData));
        return biDataService.getPos(biData);
    }
    @RequestMapping("getPos1")
    @ResponseBody
    public List<Map<String,Object>> getPos1(BiData biData){
       // System.out.println(biDataService.getPos1(biData));
        return biDataService.getPos1(biData);
    }
    @RequestMapping("getSta")
    @ResponseBody
    public List<Map<String,Object>> getSta(){

        return biDataService.getSta();
    }
    @RequestMapping("getChecked")
    @ResponseBody
    public List<Map<String,Object>> getCkecked(){

        return biDataService.getCkecked();
    }
}

