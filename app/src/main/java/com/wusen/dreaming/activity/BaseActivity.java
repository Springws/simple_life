package com.wusen.dreaming.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

/**
 * Created by BG316091 on 2017/12/14.
 */

public abstract class BaseActivity<T extends ViewDataBinding> extends Activity {
    protected T bind;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        bind = DataBindingUtil.setContentView(this, getLayoutId());
    }

    /**
     * 传递布局id
     * @return
     */
    protected abstract int getLayoutId();
}
