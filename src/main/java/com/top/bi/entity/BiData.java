package com.top.bi.entity;

import java.util.Date;

public class BiData {
    public String getChecked_state_name() {
        return checked_state_name;
    }

    public void setChecked_state_name(String checked_state_name) {
        this.checked_state_name = checked_state_name;
    }

    public BiData(Integer checked_number, String checked_state_name, String auditor, Date check_date, Date end_date, String pos_system, String data_type, String module, Date true_date, Date update_date, String state, String exceptions, String update_rule, String update_type, Integer rule_num, String data_source, String is_checked, Integer id) {
        this.checked_number = checked_number;
        this.checked_state_name = checked_state_name;
        this.auditor = auditor;
        this.check_date = check_date;
        this.end_date = end_date;
        this.pos_system = pos_system;
        this.data_type = data_type;
        this.module = module;
        this.true_date = true_date;
        this.update_date = update_date;
        this.state = state;
        this.exceptions = exceptions;
        this.update_rule = update_rule;
        this.update_type = update_type;
        this.rule_num = rule_num;
        this.data_source = data_source;
        this.is_checked = is_checked;
        this.id = id;
    }

    public Integer getChecked_number() {
        return checked_number;
    }

    public void setChecked_number(Integer checked_number) {
        this.checked_number = checked_number;
    }

    private  Integer checked_number;
    private  String checked_state_name;
    private String auditor;
    private Date check_date;
    private Date end_date;
    private String pos_system;
    private String data_type;
    private String module;

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    private Date true_date;
    private Date update_date;
    private String state;
    private String exceptions;
    private String update_rule;
    private String update_type;
    private Integer rule_num;
    private String data_source;
    private String is_checked;
    private Integer id;
    public String getAuditor() {
        return auditor;
    }
    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }
    public Date getCheck_date() {
        return check_date;
    }
    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
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
    public Date getTrue_date() {
        return true_date;
    }
    public void setTrue_date(Date true_date) {
        this.true_date = true_date;
    }
    public Date getUpdate_date() {
        return update_date;
    }
    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getExceptions() {
        return exceptions;
    }
    public void setExceptions(String exception) {
        this.exceptions = exception;
    }
    public String getUpdate_rule() {
        return update_rule;
    }
    public void setUpdate_rule(String update_rule) {
        this.update_rule = update_rule;
    }
    public String getUpdate_type() {
        return update_type;
    }
    public void setUpdate_type(String update_type) {
        this.update_type = update_type;
    }
    public Integer getRule_num() {
        return rule_num;
    }
    public void setRule_num(Integer rule_num) {
        this.rule_num = rule_num;
    }
    public String getData_source() {
        return data_source;
    }
    public void setData_source(String data_source) {
        this.data_source = data_source;
    }
    public String getIs_checked() {
        return is_checked;
    }
    public void setIs_checked(String is_checked) {
        this.is_checked = is_checked;
    }
    public Integer getId() {
        return id;
    }

    public BiData() {
    }

    public void setId(Integer id) {
        this.id = id;
    }


}

