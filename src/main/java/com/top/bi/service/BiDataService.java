package com.top.bi.service;

import com.top.bi.entity.BiData;

import java.util.List;
import java.util.Map;

public interface BiDataService {

     List<Map<String, Object>> SelectBiDataList(BiData bidata,Integer page, Integer rows);


    List<Map<String, String>> selectById(Integer id);

    void updateData(BiData bidata);

    int getCount(BiData bidata);

    List<Map<String, Object>> getState();

    List<Map<String,Object>>  getPos(BiData bidata);

    List<Map<String, Object>> getSta();

    List<Map<String, Object>> getPos1(BiData biData);

    List<Map<String, Object>> getCkecked();
}
