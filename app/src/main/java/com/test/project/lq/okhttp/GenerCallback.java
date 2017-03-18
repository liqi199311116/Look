package com.test.project.lq.okhttp;


import java.lang.reflect.ParameterizedType;

import okhttp3.Response;

/**
 * Created by Administrator on 2017/3/9 0009.
 */

public abstract class GenerCallback<T> extends Callback<T>{
    IGenericsSerializator mGenericsSerializator;

    public GenerCallback(IGenericsSerializator serializator) {
        mGenericsSerializator = serializator;
    }
    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {
        String string=response.body().string();
        //java中的获取实际参数类型
        Class<T>  clz= (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        if (clz == String.class) {
            return (T) string;
        }
        T bean = mGenericsSerializator.transform(string, clz);
        return bean;
    }
}
