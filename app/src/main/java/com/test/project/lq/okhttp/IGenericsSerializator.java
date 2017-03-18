package com.test.project.lq.okhttp;

/**
 * Created by Administrator on 2017/3/9 0009.
 */

public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}

