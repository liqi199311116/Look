package com.test.project.lq.okhttp;

/**
 * Created by Leaves on 2017/3/10.
 */

public interface DownloadCallback {

    void onProgress(int total, int progress);
    void onSuccess(String fileName);
    void onError(Exception ex);

}
