package com.top.bi.entity;

import java.util.Date;

public class DataRule {
private String pos_system;
private String data_type;
private String module;
private String updata_rule;
private String update_type;
private String rule_num;
private String data_source;
private Date update_time;
private String auditor;
private String pos_code;
private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DataRule(String pos_system, String data_type, String module, String updata_rule, String update_type, String rule_num, String data_source, Date update_time, String auditor, String pos_code, Integer id) {
        this.pos_system = pos_system;
        this.data_type = data_type;
        this.module = module;
        this.updata_rule = updata_rule;
        this.update_type = update_type;
        this.rule_num = rule_num;
        this.data_source = data_source;
        this.update_time = update_time;
        this.auditor = auditor;
        this.pos_code = pos_code;
        this.id =id;
    }

    public String getPos_system() {
        return pos_system;
    }

    public void setPos_system(String pos_system) {
        this.pos_system = pos_system;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getUpdata_rule() {
        return updata_rule;
    }

    public void setUpdata_rule(String updata_rule) {
        this.updata_rule = updata_rule;
    }

    public String getUpdate_type() {
        return update_type;
    }

    public void setUpdate_type(String update_type) {
        this.update_type = update_type;
    }

    public String getRule_num() {
        return rule_num;
    }

    public void setRule_num(String rule_num) {
        this.rule_num = rule_num;
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
        this.data_source = data_source;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getPos_code() {
        return pos_code;
    }

    public void setPos_code(String pos_code) {
        this.pos_code = pos_code;
    }
}
