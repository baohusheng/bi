package com.top.bi.service.impl;

import com.top.bi.dao.PostFileDao;
import com.top.bi.service.PostFileService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PostFileServiceImpl implements PostFileService {
@Resource
private PostFileDao postFileDao;
    @Override
    public void insert(JSONArray arr, Object system, Object fileName, Object date) {

    }
}
