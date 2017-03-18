package com.test.project.lq.okhttp;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public class HttpUtil {
     private OkHttpClient okHttpClient;
    private static HttpUtil httpUtil;

    private HttpUtil(){
        okHttpClient=new OkHttpClient();
    }

    public static HttpUtil getHttpUtil(){
        if (httpUtil==null) {
            httpUtil=new HttpUtil();
        }
        return httpUtil;
    }

    public void doGet(String url, Callback cb){

        okHttpClient.newCall(new Request.Builder().url(url).build()).enqueue(cb);


    }
    public void doPost(String url, Map<String,String> map, Callback cb) throws UnsupportedEncodingException {
        StringBuilder tempParams = new StringBuilder();

            //处理参数
            int pos = 0;
            for (String key : map.keySet()) {
                if (pos > 0) {
                    tempParams.append("&");
                }
                //对参数进行URLEncoder

                    tempParams.append(String.format("%s=%s", key, URLEncoder.encode(map.get(key), "utf-8")));
                    pos++;

            }
            //补全请求地址%s?%s
            String requestUrl = String.format("%s?%s", url, tempParams.toString());
        Log.e(TAG, "doPost: ---------"+requestUrl);
            //创建一个请求
        Request req=new Request.Builder().url(requestUrl).build();


        okHttpClient.newCall(req).enqueue(cb);


    }
}
