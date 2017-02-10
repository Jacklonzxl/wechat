package com.weimi.www.wechat;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    private Button btn;
    private MyApp myapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)this.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myapp = (MyApp)getApplication();
                myapp.setName("allan");
                //从Android系统中调用剪切板的服务
//                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//                String name = "jack";
//                clipboardManager.setText(name);
                Intent intent = new Intent(MainActivity.this,OtherActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart Method is executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart Method is executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume Method is executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause Method is executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop Method is executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy Method is executed");
    }

    
}
