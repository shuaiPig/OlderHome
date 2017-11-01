package com.example.liubo.olderhome.controller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.example.liubo.olderhome.R;
import com.example.liubo.olderhome.databinding.ActivityLoginBinding;
import com.example.liubo.olderhome.entity.User;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {
    public final static String LOG="loginActivity";
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
        context=this;
        //状态栏透明
        if(Build.VERSION.SDK_INT>=21){
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        //检测是否登陆
        SharedPreferences preferences=getSharedPreferences("user",MODE_PRIVATE);
        String isLogin=preferences.getString("status","");
        if(isLogin!=null&&!isLogin.equals("")){
            Intent intent=new Intent(this,MainActivity.class);
            intent.putExtra("userId",1);
            startActivity(intent);
            finish();
        }
        //数据绑定
        ActivityLoginBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_login);
        User user=new User();
        user.setLoginButtonOnclick(true);
        binding.setUser(user);
        EditText text= (EditText) findViewById(R.id.account);
        //获取登陆信息
        final Editable loginname=text.getText();
        EditText password= (EditText) findViewById(R.id.password);
        final Editable p=password.getText();
        //设置登录反馈事件
        binding.setLoginOnclick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendRequest(loginname,p);

            }
        });

    }

    //Handle去处理登陆信息
    Looper looper=Looper.getMainLooper();//获取主线程的Looper对象
    private Handler handler=new Handler(looper){//将主线程的传入将Handle与looper绑定
        public void handleMessage(Message msg) {
            if (msg.what==0x1111) {
                switch ((int)msg.obj){
                    case 1:
                        new AlertDialog.Builder(context).setMessage("    该用户不存在").setPositiveButton("知道了",null).show();
                        break;
                    case 2:
                        new AlertDialog.Builder(context).setMessage("    该用户密码错误").setPositiveButton("知道了",null).show();
                        break;
                    case 0:
                        //使用SharedPreferences保存信息
                        SharedPreferences preferences=context.getSharedPreferences("user",context.MODE_PRIVATE);
                        SharedPreferences.Editor editor=preferences.edit();
                        editor.putString("status","login");
                        editor.putInt("userId",1);//模拟数据
                        editor.apply();
                        Intent intent=new Intent(context, MainActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                    default:
                        new AlertDialog.Builder(context).setMessage("    发生了错误").setPositiveButton("知道了",null).show();
                        break;
                }
            }
        }
    };
    //向服务器端验证
    public void sendRequest(final Editable loginName, final Editable password){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();
                    RequestBody requestBody = new FormBody.Builder()
                            .add("loginName", String.valueOf(loginName))
                            .add("password", String.valueOf(password))
                            .build();
                    Request request = new Request.Builder()
                            .url("http://10.2.130.94:8080/login")
                            .post(requestBody)
                            .build();
                    Response response =client.newCall(request).execute() ;
                    String data=response.body().string();
                    net.sf.json.JSONArray jsonArray= net.sf.json.JSONArray.fromObject(data);
                    net.sf.json.JSONObject object=jsonArray.getJSONObject(0);
                    int status= (int) object.get("status");
                    Message message=new Message();
                    message.what=0x1111;
                    message.obj=status;
                    handler.sendMessage(message);
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


}
