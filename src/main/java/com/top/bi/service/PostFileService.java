package com.top.bi.service;

import net.sf.json.JSONArray;

public interface PostFileService {

    void insert(JSONArray arr, Object system, Object fileName, Object date);
}
