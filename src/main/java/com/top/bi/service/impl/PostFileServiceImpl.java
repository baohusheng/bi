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
                        c = arr.getJSONObject(i).containsKey(cc) ? arr.getJSONObject(i).getString(cc) : null; //	excel对应内容
                        rep.REPT(c);
                    obj.accumulate(bb,c);
                }
            String POS001= obj.containsKey("pos001")?obj.getString("pos001"):null;
            //Object POS001= obj.containsKey("pos001")?(obj.getString("pos001").length()>0?obj.getString("pos001"):null):null;
            System.out.println(obj.getString("pos001").length());
            String POS002= obj.containsKey("pos002")?obj.getString("pos002"):null;
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
            String POS035= obj.containsKey("pos035")?obj.getString("pos035"):null;
            String POS036= obj.containsKey("pos036")?obj.getString("pos036"):null;
            String POS037= obj.containsKey("pos037")?obj.getString("pos037"):null;
            String POS038= obj.containsKey("pos038")?obj.getString("pos038"):null;
            String POS039= obj.containsKey("pos039")?obj.getString("pos039"):null;
            String POS040= obj.containsKey("pos040")?obj.getString("pos040"):null;
            String POS041= obj.containsKey("pos041")?obj.getString("pos041"):null;
            String POS042= obj.containsKey("pos042")?obj.getString("pos042"):null;
            String POS043= obj.containsKey("pos043")?obj.getString("pos043"):null;
            String POS044= obj.containsKey("pos044")?obj.getString("pos044"):null;
            String POS045= obj.containsKey("pos045")?obj.getString("pos045"):null;
            String POS046= obj.containsKey("pos046")?obj.getString("pos046"):null;
            String POS047= obj.containsKey("pos047")?obj.getString("pos047"):null;
            String POS048= obj.containsKey("pos048")?obj.getString("pos048"):null;
            String POS049= obj.containsKey("pos049")?obj.getString("pos049"):null;
            String POS050= obj.containsKey("pos050")?obj.getString("pos050"):null;
            String POS051= obj.containsKey("pos051")?obj.getString("pos051"):null;
            String POS052= obj.containsKey("pos052")?obj.getString("pos052"):null;
            String POS053= obj.containsKey("pos053")?obj.getString("pos053"):null;
            String POS054= obj.containsKey("pos054")?obj.getString("pos054"):null;
            String POS055= obj.containsKey("pos055")?obj.getString("pos055"):null;
            String POS056= obj.containsKey("pos056")?obj.getString("pos056"):null;
            String POS057= obj.containsKey("pos057")?obj.getString("pos057"):null;
            String POS0181= obj.containsKey("pos0181")?obj.getString("pos0181"):null;
            String POS058= obj.containsKey("pos058")?obj.getString("pos058"):null;
            String POS059= obj.containsKey("pos059")?obj.getString("pos059"):null;
            String POS060= obj.containsKey("pos060")?obj.getString("pos060"):null;
            String POS061= obj.containsKey("pos061")?obj.getString("pos061"):null;
            String POS062= obj.containsKey("pos062")?obj.getString("pos062"):null;
            String POS063= obj.containsKey("pos063")?obj.getString("pos063"):null;
            String POS064= obj.containsKey("pos064")?obj.getString("pos064"):null;
            String POS065= obj.containsKey("pos065")?obj.getString("pos065"):null;
            String POS066= obj.containsKey("pos066")?obj.getString("pos066"):null;
            String POS067= obj.containsKey("pos067")?obj.getString("pos067"):null;
            String POS068= obj.containsKey("pos068")?obj.getString("pos068"):null;
            String POS069= obj.containsKey("pos069")?obj.getString("pos069"):null;
            String POS070= obj.containsKey("pos070")?obj.getString("pos070"):null;
            postFileDao.insert(POS001,POS002,POS003,POS004,POS005,POS006,POS007,POS008,POS009,POS010,POS011,POS012,POS013,POS014,POS015,POS016,POS017,POS018,POS019,POS020,POS021,POS022,POS023,POS024,POS025,POS026,POS027,POS028,POS029,POS030,POS031,POS032,POS033,POS034,POS035,POS036,POS037,POS038,POS039,POS040,POS041,POS042,POS043,POS044,POS045,POS046,POS047,POS048,POS049,POS050,POS051,POS052,POS053,POS054,POS055,POS056,POS057,POS0181,POS058,POS059,POS060,POS061,POS062,POS063,POS064,POS065,POS066,POS067,POS068,POS069,POS070,system,fileName,date);
        }
    }
}
