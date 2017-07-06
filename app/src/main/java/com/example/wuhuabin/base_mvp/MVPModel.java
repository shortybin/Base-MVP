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

public class MVPModel implements MVPContract.Model {
    @Override
    public void getData(MVPContract.DataCallback callback) {
        callback.showData("mvp_base");
    }
}
