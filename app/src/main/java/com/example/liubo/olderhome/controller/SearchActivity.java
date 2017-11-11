package com.example.liubo.olderhome.controller;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.example.liubo.olderhome.R;
import java.lang.reflect.Field;

/**
 * Created by liubo on 2017/11/6.
 */

public class SearchActivity extends AppCompatActivity {
    final public static String TAG="SearchActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //返回首页
        ImageView backView= (ImageView) findViewById(R.id.search_back_view);
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Log.i(TAG,"1");
        SearchView searchView = (SearchView)findViewById(R.id.searchView1);
        Log.i(TAG,"2");
        if (searchView != null) {
            try {        //--拿到字节码
                Class<?> argClass = searchView.getClass();
                Log.i(TAG,"3");
                //--指定某个私有属性,mSearchPlate是搜索框父布局的名字
                Field ownField = argClass.getDeclaredField("mSearchPlate");
                Log.i(TAG,"4");
                //--暴力反射,只有暴力反射才能拿到私有属性
                ownField.setAccessible(true);
                Log.i(TAG,"5");
                View mView = (View) ownField.get(searchView);
                //--设置背景
                mView.setBackgroundColor(Color.TRANSPARENT);
            }
            catch (Exception e) {
                e.printStackTrace();
            }}

    }
}
