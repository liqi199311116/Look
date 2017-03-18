package com.test.project.lq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.test.project.lq.bean.IUserTab;
import com.test.project.lq.bean.UserTab;
import com.test.project.lq.okhttp.HttpService;
import com.test.project.lq.okhttp.StringCallback;



import java.util.List;
import java.util.function.Consumer;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class TestActivity extends AppCompatActivity {
    private static final String TAG = "TestActivity";
    private TextView tv;
    private HttpService hs;
    Subscription sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
         tv= (TextView) findViewById(R.id.show);
        hs=new HttpService();
    }

//    public void rxjava_test(View view) {
//
//        Observable.create(new ObservableOnSubscribe<String>() {
//            @Override
//            public void subscribe(ObservableEmitter<String> e) throws Exception {
//                Log.e(TAG, "subscribe: " );
//                e.onNext("aa");
//                e.onNext("bb");
//                e.onNext("cc");
//                e.onNext("dd");
//                e.onComplete();
//                e.onNext("ff");
//            }
//        }).subscribe(new Consumer<String>() {
//            @Override
//            public void accept(String s) throws Exception {
//
//            }
//        }, new Consumer<Throwable>() {
//            @Override
//            public void accept(Throwable throwable) throws Exception {
//
//            }
//        }, new Action() {
//            @Override
//            public void run() throws Exception {
//
//            }
//        }, new Consumer<Disposable>() {
//            @Override
//            public void accept(Disposable disposable) throws Exception {
//
//            }
//        });
//    }
//
//    public void seeyou_test(View view) {
//
//        Flowable.create(new FlowableOnSubscribe<String>() {
//
//            @Override
//            public void subscribe(FlowableEmitter<String> e) throws Exception {
//                e.onNext("1");
//                Log.e(TAG, "subscribe: 1" );
//                e.onNext("2");
//                Log.e(TAG, "subscribe: 2" );
//                e.onNext("3");
//                Log.e(TAG, "subscribe: 3" );
//                e.onNext("4");
//                Log.e(TAG, "subscribe: 4" );
//                e.onNext("5");
//                Log.e(TAG, "subscribe: 5" );
//                e.onNext("6");
//                Log.e(TAG, "subscribe: 6" );
//
//            }
//        }, BackpressureStrategy.ERROR)
//                .subscribeOn(Schedulers.io())
////                .observeOn(MAIN)
//                .subscribe(new Subscriber<String>() {
//            @Override
//            public void onSubscribe(Subscription s) {
//                sub=s;
//                s.request(1);
//
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.e(TAG, "onNext: "+s );
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                Log.e(TAG, "onError: "+t.getMessage());
//            }
//
//            @Override
//            public void onComplete() {
//                Log.e(TAG, "onComplete: -----" );
//            }
//        });
//
//    }
//
//    public void seeyou_again(View view) {
//
//        sub.request(1);
//    }

    public void retrofit_test(View view) {

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://118.192.151.159:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IUserTab ut=retrofit.create(IUserTab.class);
           Call<List<UserTab>> call=ut.findAll();

        call.enqueue(new Callback<List<UserTab>>() {
            @Override
            public void onResponse(Call<List<UserTab>> call, Response<List<UserTab>> response) {
             List<UserTab>  list=response.body();
                for (UserTab u:list) {
                    Log.e(TAG, "onResponse: "+u.toString() );
                }
            }

            @Override
            public void onFailure(Call<List<UserTab>> call, Throwable t) {

            }
        });

    }

    public void able(View view) {

                 new Retrofit.Builder()
                .baseUrl("http://118.192.151.159:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(IUserTab.class)
                .findAllrx()
                         .subscribeOn(Schedulers.io())
                          .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Action1<List<UserTab>>() {
                     @Override
                     public void call(List<UserTab> userTabs) {
                         for (UserTab u:userTabs) {
                             Log.e(TAG, "onResponse: "+u.toString() );
                         }
                     }
                 })
                 ;
    }
}
