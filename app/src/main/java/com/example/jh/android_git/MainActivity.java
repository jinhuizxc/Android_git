package com.example.jh.android_git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 * 1.首先上传当前master版本到git
 * 2. 创建2.0版本
 * 3. 创建jin2.0 上传
 * 4.创建hui2.0 上传
 * 5.合并代码，上传
 * 6.修改jin2.0 代码，merge合并
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建2.0分支，开始上传
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
