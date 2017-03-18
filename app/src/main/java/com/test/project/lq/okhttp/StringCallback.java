package com.test.project.lq.okhttp;

import android.os.Handler;
import android.os.Looper;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public abstract class StringCallback implements Callback {
    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(final Call call, final Response response) throws IOException {
        Handler handler=new Handler(Looper.getMainLooper());

        handler.post(new Runnable() {
            @Override
            public void run() {

                try {
                    onResult(call,response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

  public   abstract void onResult(Call cb,String result);
}
