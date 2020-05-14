package com.top.bi.service.impl;
import com.top.bi.dao.PostFileDao;
import com.top.bi.service.PostFileService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import com.top.bi.base.*;
@Service
// ********************excel逻辑处理
public class PostFileServiceImpl implements PostFileService {
@Resource
private PostFileDao postFileDao;
    @Override
    public void insert(JSONArray arr, Object system, Object fileName, Object date) {
        ArrayList list=postFileDao.selectSystem1(system);
        JSONArray result = JSONArray.fromObject(list);
        //System.out.println(result);
        System.out.println(arr);
        String aa;
        String bb;
        String cc;
        String c;
        REP rep= new REP();
        JSONObject obj = new JSONObject();
        for (int i = 0; i < arr.size(); i++) {
                    obj.clear();
                    for (int j = 0; j < result.size(); j++) {
                        aa = result.getJSONObject(j).get("pos_file").toString();  //  pos014
                        bb = result.getJSONObject(j).containsKey("ziduan") ? result.getJSONObject(j).getString("pos_file") : null; //	门店编码
                        cc = result.getJSONObject(j).containsKey("ziduan") ? result.getJSONObject(j).getString("ziduan") : null;
//                        c = arr.getJSONObject(i).containsKey(cc) ? arr.getJSONObject(i).getString(cc) : null; //	excel对应内容
//                        rep.REPT(c);
                        if(arr.getJSONObject(i).containsKey(cc)) obj.accumulate(bb,rep.REPT(arr.getJSONObject(i).getString(cc)));
                    }

            String POS003= obj.containsKey("pos003")?obj.getString("pos003"):null;
            String POS004= obj.containsKey("pos004")?obj.getString("pos004"):null;
            String POS005= obj.containsKey("pos005")?obj.getString("pos005"):null;
            String POS006= obj.containsKey("pos006")?obj.getString("pos006"):null;
            String POS007= obj.containsKey("pos007")?obj.getString("pos007"):null;
            String POS008= obj.containsKey("pos008")?obj.getString("pos008"):null;
            String POS009= obj.containsKey("pos009")?obj.getString("pos009"):null;
            String POS010= obj.containsKey("pos010")?obj.getString("pos010"):null;
            String POS011= obj.containsKey("pos011")?obj.getString("pos011"):null;
            String POS012= obj.containsKey("pos012")?obj.getString("pos012"):null;
            String POS013= obj.containsKey("pos013")?obj.getString("pos013"):null;
            String POS014= obj.containsKey("pos014")?obj.getString("pos014"):null;
            String POS015= obj.containsKey("pos015")?obj.getString("pos015"):null;
            String POS016= obj.containsKey("pos016")?obj.getString("pos016"):null;
            String POS017= obj.containsKey("pos017")?obj.getString("pos017"):null;
            String POS018= obj.containsKey("pos018")?obj.getString("pos018"):null;
            String POS019= obj.containsKey("pos019")?obj.getString("pos019"):null;
            String POS020= obj.containsKey("pos020")?obj.getString("pos020"):null;
            String POS021= obj.containsKey("pos021")?obj.getString("pos021"):null;
            String POS022= obj.containsKey("pos022")?obj.getString("pos022"):null;
            String POS023= obj.containsKey("pos023")?obj.getString("pos023"):null;
            String POS024= obj.containsKey("pos024")?obj.getString("pos024"):null;
            String POS025= obj.containsKey("pos025")?obj.getString("pos025"):null;
            String POS026= obj.containsKey("pos026")?obj.getString("pos026"):null;
            String POS027= obj.containsKey("pos027")?obj.getString("pos027"):null;
            String POS028= obj.containsKey("pos028")?obj.getString("pos028"):null;
            String POS029= obj.containsKey("pos029")?obj.getString("pos029"):null;
            String POS030= obj.containsKey("pos030")?obj.getString("pos030"):null;
            String POS031= obj.containsKey("pos031")?obj.getString("pos031"):null;
            String POS032= obj.containsKey("pos032")?obj.getString("pos032"):null;
            String POS033= obj.containsKey("pos033")?obj.getString("pos033"):null;
            String POS034= obj.containsKey("pos034")?obj.getString("pos034"):null;
            Double POS035= obj.containsKey("pos035")?Double.parseDouble(obj.getString("pos035")):null;
            String POS036= obj.containsKey("pos036")?obj.getString("pos036"):null;
            Double POS037= obj.containsKey("pos037")?Double.parseDouble(obj.getString("pos037")):null;
            String POS038= obj.containsKey("pos038")?obj.getString("pos038"):null;
            String POS039= obj.containsKey("pos039")?obj.getString("pos039"):null;
            String POS040= obj.containsKey("pos040")?obj.getString("pos040"):null;
            Double POS041= obj.containsKey("pos041")?Double.parseDouble(obj.getString("pos041").contains(",")?obj.getString("pos041").replace(",",""):obj.getString("pos041")):null;
            Double POS042= obj.containsKey("pos042")?Double.parseDouble(obj.getString("pos042").contains("(")?obj.getString("pos042").replace("(","-").replace(")",""):obj.getString("pos042")):null;
            Double POS043= obj.containsKey("pos043")?Double.parseDouble(obj.getString("pos043")):null;
            Double POS044= obj.containsKey("pos044")?Double.parseDouble(obj.getString("pos044")):null;
            Double POS045= obj.containsKey("pos045")?Double.parseDouble(obj.getString("pos045")):null;
            Double POS046= obj.containsKey("pos046")?Double.parseDouble(obj.getString("pos046")):null;
            Double POS047= obj.containsKey("pos047")?Double.parseDouble(obj.getString("pos047")):null;
            Double POS048= obj.containsKey("pos048")?Double.parseDouble(obj.getString("pos048")):null;
            Double POS049= obj.containsKey("pos049")?Double.parseDouble(obj.getString("pos049")):null;
            Double POS050= obj.containsKey("pos050")?Double.parseDouble(obj.getString("pos050")):null;
            Double POS051= obj.containsKey("pos051")?Double.parseDouble(obj.getString("pos051")):null;
            Double POS052= obj.containsKey("pos052")?Double.parseDouble(obj.getString("pos052")):null;
            Double POS053= obj.containsKey("pos053")?Double.parseDouble(obj.getString("pos053")):null;
            String POS054= obj.containsKey("pos054")?obj.getString("pos054"):null;
            String POS055= obj.containsKey("pos055")?obj.getString("pos055"):null;
            String POS056= obj.containsKey("pos056")?obj.getString("pos056"):null;
            String POS057= obj.containsKey("pos057")?obj.getString("pos057"):null;
            String POS0181= obj.containsKey("pos0181")?obj.getString("pos0181"):null;
            Double POS058= obj.containsKey("pos058")?Double.parseDouble(obj.getString("pos058")):null;
            Double POS059= obj.containsKey("pos059")?Double.parseDouble(obj.getString("pos059").contains(",")?obj.getString("pos059").replace(",",""):obj.getString("pos059")):null;
            String POS060= obj.containsKey("pos060")?obj.getString("pos060"):null;
            String POS061= obj.containsKey("pos061")?obj.getString("pos061"):null;
            String POS062= obj.containsKey("pos062")?obj.getString("pos062"):null;
            String POS063= obj.containsKey("pos063")?obj.getString("pos063"):null;
            String POS064= obj.containsKey("pos064")?obj.getString("pos064"):null;
            Double POS065= obj.containsKey("pos065")?Double.parseDouble(obj.getString("pos065")):null;
            Double POS066= obj.containsKey("pos066")?Double.parseDouble(obj.getString("pos066")):null;
            Double POS067= obj.containsKey("pos067")?Double.parseDouble(obj.getString("pos067")):null;
            Double POS068= obj.containsKey("pos068")?Double.parseDouble(obj.getString("pos068")):null;
            Double POS069= obj.containsKey("pos069")?Double.parseDouble(obj.getString("pos069")):null;
            Double POS070= obj.containsKey("pos070")?Double.parseDouble(obj.getString("pos070")):null;
            postFileDao.insert(POS003,POS004,POS005,POS006,POS007,POS008,POS009,POS010,POS011,POS012,POS013,POS014,POS015,POS016,POS017,POS018,POS019,POS020,POS021,POS022,POS023,POS024,POS025,POS026,POS027,POS028,POS029,POS030,POS031,POS032,POS033,POS034,POS035,POS036,POS037,POS038,POS039,POS040,POS041,POS042,POS043,POS044,POS045,POS046,POS047,POS048,POS049,POS050,POS051,POS052,POS053,POS054,POS055,POS056,POS057,POS0181,POS058,POS059,POS060,POS061,POS062,POS063,POS064,POS065,POS066,POS067,POS068,POS069,POS070,system,fileName,date);
        }
    }
}
