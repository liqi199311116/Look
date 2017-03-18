package com.test.project.lq.okhttp;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import okhttp3.Callback;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public class HttpService {


    public void getNba(Callback cb){
        HttpUtil.getHttpUtil().doGet(NetApi.SEEYOU,cb);
    }
    public void testSeeYou(Callback cb){
        HttpUtil.getHttpUtil().doGet(NetApi.SEEYOU,cb);
    }

    public void postNba(Map<String,String> map,Callback cb) throws UnsupportedEncodingException {
        HttpUtil.getHttpUtil().doPost(UrlContains.URL_Post,map,cb);
    }




}
