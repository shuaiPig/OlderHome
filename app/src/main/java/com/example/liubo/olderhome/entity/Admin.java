package com.example.liubo.olderhome.entity;

public class Admin {
    private Integer id;

    private String loginname;

    private String adminname;

    private String loginpass;

    private String adminsex;

    private Integer status;

    public Admin(Integer id, String loginname, String adminname, String loginpass, String adminsex, Integer status) {
        this.id = id;
        this.loginname = loginname;
        this.adminname = adminname;
        this.loginpass = loginpass;
        this.adminsex = adminsex;
        this.status = status;
    }

    public Admin() {
        super();
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
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass == null ? null : loginpass.trim();
    }

    public String getAdminsex() {
        return adminsex;
    }

    public void setAdminsex(String adminsex) {
        this.adminsex = adminsex == null ? null : adminsex.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}