package com.test.project.lq.okhttp;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/3/9 0009.
 */

public abstract class Callback<T> {

    public abstract T parseNetworkResponse(Response response, int id) throws Exception;

    public abstract  void onError(Call call,Exception e,int id);

    public abstract void onResponse(T response, int id);

    public static Callback CALLBACK_DEFAULT = new Callback() {
        @Override
        public Object parseNetworkResponse(Response response, int id) throws Exception {
            return null;
        }

        @Override
        public void onError(Call call, Exception e, int id) {

        }

        @Override
        public void onResponse(Object response, int id) {

        }
    };
}
