package com.top.bi.controller;
import com.top.bi.entity.User;
import com.top.bi.service.PostFileService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
public class PostFileController {
    @Resource
    private PostFileService postFileService;
    @RequestMapping("/excel")
    public String see(){
        return "postFile";

    }

    @RequestMapping(value = "/getExcel",method = RequestMethod.POST)
    @ResponseBody
    public void getPos(@RequestBody String e){
        //System.out.println(e);
        JSONObject json = JSONObject.fromObject(e);
        Object excelFile = json.get("excelFile");
        Object system = json.get("system");
        Object fileName = json.get("fileName");
        Object date = json.get("date");
        JSONArray arr = JSONArray.fromObject(excelFile);
        System.out.println(arr.size());
        for (int i=0;i<arr.size();i++) {
            System.out.println(arr.getJSONObject(i).keySet());
            System.out.println(arr.getJSONObject(i).get("id"));

        }
        postFileService.insert(arr,system,fileName,date);
    }
}


