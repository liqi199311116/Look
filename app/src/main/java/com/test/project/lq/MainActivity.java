package com.test.project.lq;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.project.lq.okhttp.HttpService;
import com.test.project.lq.okhttp.HttpUtil;
import com.test.project.lq.okhttp.StringCallback;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.https.HttpsUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private Button btnGet;
    private Button btnPost;
    private TextView tv;
    HttpService httpService=new HttpService();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGet= (Button) findViewById(R.id.btn_get);
        btnPost= (Button) findViewById(R.id.btn_post);
        tv= (TextView) findViewById(R.id.tv_content);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*new OkHttpClient().newCall(new Request.Builder().url("").build()).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                    }

                });  */
                httpService.getNba(new StringCallback() {
                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        super.onResponse(call, response);
                    }

                    @Override
                    public void onResult(Call cb, String result) {

                        tv.setText(result);
                    }
                });


            }

        });

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("id", "4");
                map.put("page", "5");
                map.put("rows", "2");
                try {
                    httpService.postNba(map, new StringCallback() {
                        @Override
                        public void onResult(Call cb, String result) {
                            tv.setText(result);
                        }
                    });
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                OkHttpUtils.get().url("").params(map).build().execute(new BitmapCallback() {
                    @Override
                    public void onError(Call call, Exception e, int i) {

                    }

                    @Override
                    public void onResponse(Bitmap bitmap, int i) {

                    }
                });
            }

        });
    }


}
