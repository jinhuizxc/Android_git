package com.example.jh.android_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *
 * 1.首先上传当前master版本到git
 * 2. 创建2.0版本
 * 3. 创建jin2.0 上传
 * 4.创建hui2.0 上传
 * 5.合并代码，上传
 * 6.修改jin2.0 代码，merge合并
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建2.0分支，开始上传

    }
}
