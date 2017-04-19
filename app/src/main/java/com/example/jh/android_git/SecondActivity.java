package com.example.jh.android_git;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jinhui  on 2017/4/19
 * 邮箱: 1004260403@qq.com
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 创建jin2.0版本，并上传
        setContentView(R.layout.activity_second);
        // 创建2.0 下创建jin2.00版本，并没有jin2.00分支这样操作不行。
        //目前git是2.0开始创建jin2.0 分支
    }
}
