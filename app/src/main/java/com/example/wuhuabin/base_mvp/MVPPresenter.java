package com.example.wuhuabin.base_mvp;

/**
 * <pre>
 *     author : shortbin
 *     e-mail : xxx@xx
 *     time   : 2017/07/06
 *     desc   : xxxx描述
 *     version: 1.0
 * </pre>
 */

public class MVPPresenter extends MVPContract.Presenter {

    @Override
    void getData() {
        mModel.getData(new MVPContract.DataCallback() {
            @Override
            public void showData(String data) {
                if (mView!=null){
                    mView.showData(data);
                }
            }
        });
    }
}
