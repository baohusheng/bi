package com.top.bi.dao;

import com.top.bi.entity.DataRule;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface DataRuleDao {
    List<Map<String, Object>> SelectDataRule(DataRule dateRule, Integer page, Integer rows);

    int getCount(DataRule dateRule);

    void updateRule(DataRule dateRule);
    @Select("<script>" +
            "select pos_system,max(id) id from t_data_rule group by pos_system " +
            "</script>")
    List<Map<String, Object>> getXt(DataRule dateRule);

    void addDataRule(DataRule dataRule);
    @Select("<script>" +
            "delete from t_data_rule where id=#{id} "+
            "</script>")
    void deleted(DataRule dataRule);
    @Select("<script>" +
            "select module,max(id) id from t_data_rule group by module " +
            "</script>")
    List<Map<String, Object>> getModule();
}
