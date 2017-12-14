package com.wusen.dreaming.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by wusen on 2017/12/14.
 */

public class RetrofitHelper {
    private static RetrofitHelper helper;
    private Retrofit retrofit;
    public static RetrofitHelper getInstance() {
        RetrofitHelper helper = new RetrofitHelper();
        return helper;
    }

    private RetrofitHelper() {
        if (helper == null) {
            synchronized (RetrofitHelper.class) {
                if (helper == null) {
                    helper = new RetrofitHelper();
                    initRetrofit();
                }
            }
        }
    }

    private void initRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(buildOkhttpClient())
                .build();
    }

    private OkHttpClient buildOkhttpClient() {
        // Log信息拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                     .addInterceptor(loggingInterceptor)
                     .build();
        return client;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    private void createApi(Class cls) {
    }
}
