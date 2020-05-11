package com.top.bi.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REP {
    public String REPT(String str){
        if(str==null){
          return null;
        }else {
        Pattern r=Pattern.compile("\\s*|\t|\r|\n");
        Matcher mat=r.matcher(str);
        String f=mat.replaceAll("");
        return f;
        }
    }
}
