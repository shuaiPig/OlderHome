package com.example.liubo.olderhome.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;


import com.example.liubo.olderhome.R;
import com.example.liubo.olderhome.entity.Service;

import java.util.ArrayList;

/**
 * Created by liubo on 2017/11/9.
 */

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener,PopupMenu.OnMenuItemClickListener {
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    protected ArrayList<Service> services=new ArrayList<>();
    final public static String TAG="ServiceActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
       initView();
        //初始化数据
        initData();
        //设置图片最大的高度


        //创建瀑布流的recycleView
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.service_recycleView);
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        ServiceListAdapter adapter=new ServiceListAdapter(services);
        recyclerView.setAdapter(adapter);


    }
    private void initData(){
        Service service0=new Service(1,"60平米打扫","","","",R.drawable.three);
        Service service1=new Service(1,"帮助康复练习","1","","",R.drawable.older_nurse);
        Service service2=new Service(1,"自助清洁","","1","",R.drawable.cleaning);
        Service service3=new Service(1,"90平米打扫","","1","1",R.drawable.house_image);
        Service service4=new Service(3,"陪同就医","","123","",R.drawable.doctor);
        Service service7=new Service(1,"100平米打扫","","123","",R.drawable.three);
        Service service6=new Service(1,"家政服务-烹饪","","1","",R.drawable.cooking);
        Service service5=new Service(1,"陪同外出","","","",R.drawable.outing);
        services.add(service0);
        services.add(service1);
        services.add(service2);
        services.add(service3);
        services.add(service4);
        services.add(service5);
        services.add(service6);
        services.add(service7);
    }

    private void initView(){
        radioButton1= (RadioButton) findViewById(R.id.rb_bank);
        radioButton2= (RadioButton) findViewById(R.id.rb_range);
        radioButton3= (RadioButton) findViewById(R.id.rb_money);
        imageView1= (ImageView) findViewById(R.id.arrow1);
        imageView2= (ImageView) findViewById(R.id.arrow2);
        imageView3= (ImageView) findViewById(R.id.arrow3);
        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rb_bank:
                PopupMenu popup = new PopupMenu(this, v);
                MenuInflater inflater = popup.getMenuInflater();
                inflater.inflate(R.menu.sequence, popup.getMenu());
                popup.setOnMenuItemClickListener(this);
                popup.show();
                break;
            case R.id.rb_range:
                PopupMenu popup1 = new PopupMenu(this, v);
                MenuInflater inflater1 = popup1.getMenuInflater();
                inflater1.inflate(R.menu.type, popup1.getMenu());
                popup1.setOnMenuItemClickListener(this);
                popup1.show();
                break;
            case R.id.rb_money:
                PopupMenu popup2 = new PopupMenu(this, v);
                MenuInflater inflater2 = popup2.getMenuInflater();
                inflater2.inflate(R.menu.evaluation, popup2.getMenu());
                popup2.setOnMenuItemClickListener(this);
                popup2.show();
                break;
        }

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.evaluation_height:
                Toast.makeText(this, "6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.evaluation_below:
                Toast.makeText(this, "5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.price_height:
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.price_below:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.housekeeping:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nursing:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return false;
    }
}
