package com.top.bi.service.impl;

import com.top.bi.dao.BiDataDao;
import com.top.bi.entity.BiData;
import com.top.bi.service.BiDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BiDataServiceImpl implements BiDataService {
    @Resource
    private BiDataDao biDataDao;
    @Override
    public List<Map<String, Object>> SelectBiDataList(BiData bidata,Integer page, Integer rows) {
        return biDataDao.SelectBiDataList(bidata,page,rows);
    }

    @Override
    public List<Map<String, String>> selectById(Integer id) {
        return biDataDao.selectById(id);
    }

    @Override
    public void updateData(BiData bidata) {
        biDataDao.updateData(bidata);
    }

    @Override
    public int getCount(BiData bidata) {

        return biDataDao.getCounts(bidata);
    }

    @Override
    public List<Map<String, Object>> getState() {
        return biDataDao.getState();
    }

    @Override
    public List<Map<String,Object>>  getPos(BiData bidata) {
        return biDataDao.getPos(bidata);
    }

    @Override
    public List<Map<String, Object>> getSta() {
        return biDataDao.getSta();
    }

    @Override
    public List<Map<String, Object>> getPos1(BiData biData) {
        return biDataDao.getPos1(biData);
    }

    @Override
    public List<Map<String, Object>> getCkecked() {
        return biDataDao.getCkecked();
    }
}
