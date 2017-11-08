package com.example.liubo.olderhome.controller;


import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.example.liubo.olderhome.R;
import com.example.liubo.olderhome.entity.Service;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener , View.OnClickListener {

    public static final String one="MainActivity";
    public ArrayList<Service> services=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.i(one,"在这里");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all);
        //状态栏透明
        if(Build.VERSION.SDK_INT>=21){
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        //设置折叠主页菜单
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //为主功能键设置点击事件
        LinearLayout clockView= (LinearLayout) findViewById(R.id.setClock);
        clockView.setOnClickListener(this);
        LinearLayout searchView= (LinearLayout) findViewById(R.id.search_button1);
        searchView.setOnClickListener(this);

        initService();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.main_recycle_view);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        ListAdapter listAdapter=new ListAdapter(services);
        recyclerView.setAdapter(listAdapter);
    }
    public void initService(){
        Service service0=new Service(1,"1","","","",R.drawable.three);
        Service service1=new Service(1,"","1","","",R.drawable.three);
        Service service2=new Service(1,"1","","1","",R.drawable.three);
        Service service3=new Service(1,"1","","1","1",R.drawable.three);
        Service service4=new Service(3,"","","123","",R.drawable.three);
        Service service5=new Service(1,"1","","123","",R.drawable.three);
        Service service6=new Service(1,"","","1","",R.drawable.three);
        Service service7=new Service(1,"","","","",R.drawable.three);
        services.add(service0);
        services.add(service1);
        services.add(service2);
        services.add(service3);
        services.add(service4);
        services.add(service5);
        services.add(service6);
        services.add(service7);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.setClock:
            Intent intent=new Intent(this,ClockActivity.class);
                startActivity(intent);
            break;
            case R.id.search_button1:
            Intent intent1=new Intent(this,SearchActivity.class);
                startActivity(intent1);
            break;


        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_account) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_address) {

        } else if (id == R.id.nav_listshow) {

        } else if (id == R.id.nav_contact) {

        } else if (id == R.id.nav_loginout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
