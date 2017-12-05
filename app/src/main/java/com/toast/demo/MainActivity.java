package com.toast.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();


    AnimaProgressBar mCommonProgressView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCommonProgressView = (AnimaProgressBar) findViewById(R.id.common_progress);


        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 开启动画

                mCommonProgressView.setProgressWithAnima(100);
            }
        });
    }
}
