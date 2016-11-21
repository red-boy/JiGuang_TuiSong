package com.example.administrator.jiguang_tuisong;

import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.BasicPushNotificationBuilder;
import cn.jpush.android.api.CustomPushNotificationBuilder;
import cn.jpush.android.api.JPushInterface;

/**
 * 极光推送运用：
 * 1.自定义通知栏样式
 * 2.自定义消息推送
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //默认通知栏样式
        BasicPushNotificationBuilder builder = new BasicPushNotificationBuilder(MainActivity.this);
        builder.statusBarDrawable = R.drawable.main_telmgr;
        builder.notificationFlags = Notification.FLAG_AUTO_CANCEL
                | Notification.FLAG_SHOW_LIGHTS;  //设置为自动消失和呼吸灯闪烁
        builder.notificationDefaults = Notification.DEFAULT_SOUND
                | Notification.DEFAULT_VIBRATE
                | Notification.DEFAULT_LIGHTS;  // 设置为铃声、震动、呼吸灯闪烁都要
        JPushInterface.setPushNotificationBuilder(1, builder);


        //高级自定义通知栏样式:根据个人需求，修改为定制的 Notification Layout布局文件样式
        CustomPushNotificationBuilder builder3 = new
                CustomPushNotificationBuilder(MainActivity.this,
                R.layout.customer_notitfication_layout,
                R.id.icon,
                R.id.title,
                R.id.text);
        // 指定最顶层状态栏小图标
        builder3.statusBarDrawable = R.drawable.main_telmgr;
        // 指定下拉状态栏时显示的通知图标
        builder3.layoutIconDrawable = R.drawable.main_filemgr;

        JPushInterface.setPushNotificationBuilder(3, builder3);
    }
}
