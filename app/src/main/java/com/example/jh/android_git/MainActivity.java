package com.example.jh.android_git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.Button;

/**
 *
 * 1.首先上传当前master版本到git
 * 2. 创建2.0版本
 * 3. 创建jin2.0 上传
 * 4.创建hui2.0 上传
 * 5.合并代码，上传
 * 6.首先要选中2.0 然后在merge 会将jin2.0代码合并到2.0上面
 * 7. 接着将2.0代码上传，然后在hui2.0这里pull下来
 * 8. 切换到自己的分支再merge（合并就可以啦）
 * 9.因为现在这个版本是将2.0的代码合并至hui2.0中但是2.0并没有hui2.0的改变。可以检查下2.0有没有新增的布局
 * 10.这时切换到2.0没有那个新增布局需要merge到2.0，然后在将代码统一上传至远程。
 * 11.至此整个过程完成。
 * 12.发现切回jin2.0之后没有那个新增布局，但是远程2.0版本和hui2.0都有了这个布局，
 * 13.如何操作呢？首先切换到2.0从网络端pull下来，cheakout，在merge就将新增布局整合到jin2.0分支。
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
