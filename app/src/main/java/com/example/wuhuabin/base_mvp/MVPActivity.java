package com.example.wuhuabin.base_mvp;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.wuhuabin.base_mvp.base.BaseActivity;

public class MVPActivity extends BaseActivity<MVPPresenter,MVPModel> implements MVPContract.View{

    private Button mButton;

    @Override
    public int getLayoutId() {
        return R.layout.activity_mvp;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this,mModel);
    }

    @Override
    public void initView() {
        mButton= (Button) findViewById(R.id.get_data);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getData();
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

    }

    @Override
    public void showData(String data) {
        Toast.makeText(MVPActivity.this,data,Toast.LENGTH_LONG).show();
    }
}
