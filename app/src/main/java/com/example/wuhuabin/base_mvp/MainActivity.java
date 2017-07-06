package com.example.wuhuabin.base_mvp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.wuhuabin.base_mvp.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private Button mButton;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     * 不用MVP模式的不用做任何操作
     */
    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        mButton= (Button) findViewById(R.id.mvp);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MVPActivity.class));
            }
        });
    }

    @Override
    public void initData() {

    }
}
