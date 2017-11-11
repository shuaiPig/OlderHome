package com.example.liubo.olderhome.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.liubo.olderhome.R;
import com.example.liubo.olderhome.util.MyUtil;

/**
 * 闹钟控制
 * Created by liubo on 2017/10/21.
 */

public class AlarmActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 新建闹钟的requestCode
     */
    private static final int REQUEST_ALARM_CLOCK_NEW = 1;

    /**
     * 修改闹钟的requestCode
     */
    private static final int REQUEST_ALARM_CLOCK_EDIT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fm_alarm_clock);

        // 操作栏新建按钮
        ImageView newAction = (ImageView) findViewById(R.id.action_new);
        newAction.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.action_new:
                // 不响应重复点击
                if (MyUtil.isFastDoubleClick()) {
                    return;
                }
                Intent intent = new Intent(this,
                        AlarmClockNewActivity.class);
                // 开启新建闹钟界面
                startActivityForResult(intent, REQUEST_ALARM_CLOCK_NEW);
                break;
        }
    }
}
