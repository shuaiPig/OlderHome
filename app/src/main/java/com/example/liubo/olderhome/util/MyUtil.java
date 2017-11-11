package com.example.liubo.olderhome.util;


import android.os.SystemClock;

/**
 * 工具类
 *
 * @author liao
 * @time 2017/11/10
 */
public class MyUtil {

    /**
     * Log tag ：MyUtil
     */
    private static final String LOG_TAG = "MyUtil";

    private static long mLastClickTime = 0;             // 按钮最后一次点击时间
    private static final int SPACE_TIME = 500;          // 空闲时间

    /**
     * 是否连续点击按钮多次
     *
     * @return 是否快速多次点击
     */
    public static boolean isFastDoubleClick() {
        long time = SystemClock.elapsedRealtime();
        if (time - mLastClickTime <= SPACE_TIME) {
            return true;
        } else {
            mLastClickTime = time;
            return false;
        }
    }
}
