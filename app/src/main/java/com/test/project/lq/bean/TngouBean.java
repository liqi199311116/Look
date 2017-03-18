package com.test.project.lq.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/5 0005.
 */
public class TngouBean {
    @Override
    public String toString() {
        return "TngouBean{" +
                "count=" + count +
                ", description='" + description + '\'' +
                ", fcount=" + fcount +
                ", fromname='" + fromname + '\'' +
                ", fromurl='" + fromurl + '\'' +
                ", id=" + id +
                ", img='" + img + '\'' +
                ", keywords='" + keywords + '\'' +
                ", rcount=" + rcount +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", topclass=" + topclass +
                '}';
    }

    /**
     * count : 90
     * description : 第九点联赛中要有国内运动员综合得分的排名，要将排名与其个人荣誉相挂钩，排名要不断更新，不断曝光
     * fcount : 0
     * fromname : 中华网
     * fromurl : http://news.china.com/domestic/945/20170102/30133436.html
     * id : 14938
     * img : /top/170102/ecaa348c7fbb5fb9812000d5afc2a588.jpg
     * keywords : 姚明或任篮协主席
     * rcount : 0
     * time : 1483334067000
     * title : 重磅!曝体育总局建议姚明任篮协主席 兼任男篮主帅
     * topclass : 4
     */

    private int count;
    private String description;
    private int fcount;
    private String fromname;
    private String fromurl;
    private int id;
    private String img;
    private String keywords;
    private int rcount;
    private long time;
    private String title;
    private int topclass;

    public static TngouBean objectFromData(String str) {

        return new Gson().fromJson(str, TngouBean.class);
    }

    public static TngouBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TngouBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<TngouBean> arrayTngouBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<TngouBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<TngouBean> arrayTngouBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<TngouBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public String getFromname() {
        return fromname;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname;
    }

    public String getFromurl() {
        return fromurl;
    }

    public void setFromurl(String fromurl) {
        this.fromurl = fromurl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTopclass() {
        return topclass;
    }

    public void setTopclass(int topclass) {
        this.topclass = topclass;
    }
}
