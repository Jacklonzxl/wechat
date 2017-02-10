package com.weimi.www.wechat;

import android.app.Application;

/**
 * Created by Administrator on 2017/1/16 0016.
 */

public class MyApp extends Application {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setName("张三");
    }
}
