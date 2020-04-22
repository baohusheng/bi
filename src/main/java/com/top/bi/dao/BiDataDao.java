package com.top.bi.dao;

import com.top.bi.entity.BiData;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BiDataDao {

    List<Map<String, Object>> SelectBiDataList(BiData bidata,Integer page, Integer rows);

    List<Map<String, String>> selectById(Integer id);

    void updateData(BiData bidata);

    int getCounts(BiData bidata);
@Select("<script>" +
        "select module,max(id) id from t_data_check group by module " +
        "</script>")
    List<Map<String, Object>> getState();
    @Select("<script>" +
            "select pos_system,max(id) id from t_data_check where module=#{module}  group by pos_system " +
            "</script>")
    List<Map<String,Object>>  getPos(BiData bidata);
    @Select("<script>" +
            "select state,max(id) id from t_data_check group by state " +
            "</script>")
    List<Map<String, Object>> getSta();
    @Select("<script>" +
            "select pos_system,max(id) id from t_data_check  group by pos_system " +
            "</script>")
    List<Map<String, Object>> getPos1(BiData biData);
    @Select("<script>" +
            "select is_checked,max(id) id from t_data_check group by is_checked " +
            "</script>")
    List<Map<String, Object>> getCkecked();
}

