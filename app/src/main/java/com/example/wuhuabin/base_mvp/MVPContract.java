package com.example.wuhuabin.base_mvp;

import com.example.wuhuabin.base_mvp.base.BaseModel;
import com.example.wuhuabin.base_mvp.base.BasePresenter;
import com.example.wuhuabin.base_mvp.base.BaseView;

/**
 * <pre>
 *     author : shortbin
 *     e-mail : xxx@xx
 *     time   : 2017/07/06
 *     desc   : xxxx描述
 *     version: 1.0
 * </pre>
 */

public interface MVPContract {

    interface View extends BaseView{
        void showData(String data);
    }

    interface Model extends BaseModel{
        void getData(DataCallback callback);
    }

    abstract class Presenter extends BasePresenter<View,Model>{
        abstract void getData();
    }

    interface DataCallback{
        void showData(String data);
    }

}
