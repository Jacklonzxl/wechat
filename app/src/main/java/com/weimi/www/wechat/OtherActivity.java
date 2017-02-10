package com.weimi.www.wechat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/1/16 0016.
 */

public class OtherActivity extends AppCompatActivity {

    private TextView textview;
    private MyApp myapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);

        textview = (TextView)this.findViewById(R.id.msg);
        myapp = (MyApp)getApplication();
        textview.setText("--myapp Application->>--"+myapp.getName());
    }
}
