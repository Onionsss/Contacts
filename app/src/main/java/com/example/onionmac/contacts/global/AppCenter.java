package com.example.onionmac.contacts.global;

import android.app.Application;
import android.app.usage.ConfigurationStats;
import android.content.Context;

/**
 * Created by OnionMac on 17/3/24.
 */

/**
 * 联系人项目
 * 需求: 拿到用户手机的所有联系人
 *       sim的联系人
 *       本地数据库里的联系人
 */
public class AppCenter extends Application {

    /**
     * 全局的Context
     */
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        sContext = this;
    }
}
