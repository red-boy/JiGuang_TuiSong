package com.example.administrator.jiguang_tuisong;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @author Administrator.
 * @version .
 * @time .
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);



    }
}
