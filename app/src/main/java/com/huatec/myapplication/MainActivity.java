package com.huatec.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button hintToast1;
    private Button hintToast2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hintToast1 = findViewById(R.id.hint_toast);
        hintToast2 = findViewById(R.id.hint_toast2);

        hintToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建Toast
                new MyToast.Builder(MainActivity.this)
                        .setMessage("你好吗？")//设置提示文字
                        .setBackgroundColor(0x88ff4587)//设置背景颜色
                        .setGravity(Gravity.CENTER)//设置吐司位置
                        .build()//创建吐司
                        .show();
            }
        });

        hintToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MyToast.Builder(MainActivity.this)
                        .setMessage("你好吗？")
                        .setBackgroundColor(0x88ff4587)
                        .setGravity(Gravity.CENTER)
                        .setIcon(R.mipmap.ic_launcher)//设置图标
                        .showIcon(true)//是否显示图标
                        .build()
                        .show();
            }
        });

    }
}
