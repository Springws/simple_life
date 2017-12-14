package com.wusen.dreaming;

import android.os.Bundle;
import android.view.View;

import com.wusen.dreaming.activity.BaseActivity;
import com.wusen.dreaming.databinding.ActivityMainBinding;
import com.wusen.dreaming.model.InstantMoviewResponse;
import com.wusen.dreaming.network.RetrofitHelper;
import com.wusen.dreaming.network.service.MovieService;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * wusen
 * 主页面
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind.requestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
