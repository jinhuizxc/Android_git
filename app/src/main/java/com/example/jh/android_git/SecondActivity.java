package com.example.jh.android_git;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jinhui  on 2017/4/19
 * 邮箱: 1004260403@qq.com
 */

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 创建jin2.0版本，并上传
        setContentView(R.layout.activity_second);
        // 创建2.0 下创建jin2.00版本，并没有jin2.00分支这样操作不行。
        //目前git是2.0开始创建jin2.0 分支
        //现在jin2.0 分支已经上传，开始写个跳转，待会与hui2.0合并
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
