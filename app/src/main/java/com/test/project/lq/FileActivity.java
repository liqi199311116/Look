package com.test.project.lq;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.test.project.lq.okhttp.DownloadCallback;
import com.test.project.lq.okhttp.DownloadManager;
import com.test.project.lq.okhttp.NetApi;

public class FileActivity extends AppCompatActivity {

    private Button btnFile;
    private ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
        btnFile= (Button) findViewById(R.id.btn_file);
        pb= (ProgressBar) findViewById(R.id.progressBar);
     final   DownloadManager dm=new DownloadManager(FileActivity.this);

        btnFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M) {
                    if (shouldShowRequestPermissionRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

                    } else {
                        if (ContextCompat.checkSelfPermission(FileActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(FileActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
                        } else {

                            dm.download(NetApi.API_DOWNLOAD_WEIBO, new DownloadCallback() {
                                @Override
                                public void onProgress(int total, int progress) {
                                    int pro= (int) (((double)(progress/total))*100);
                                    pb.setProgress(pro);
                                }

                                @Override
                                public void onSuccess(String fileName) {

                                }

                                @Override
                                public void onError(Exception ex) {

                                }
                            });

                        }
                    }

                }
            }
        });



    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


    }
}
