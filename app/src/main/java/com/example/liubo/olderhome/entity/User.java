package com.example.liubo.olderhome.entity;



public class User{
    private Integer id;

    private String loginname;

    private String password;

    private String number;

    private Integer peopleid;

    private String photo;

    private boolean isOnclick;

    public boolean isLoginButtonOnclick() {
        return isOnclick;
    }

    public void setLoginButtonOnclick(boolean loginButtonOnclick) {
        isOnclick = loginButtonOnclick;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isOnclick() {
        return isOnclick;
    }

    public void setOnclick(boolean onclick) {
        isOnclick = onclick;
    }
}