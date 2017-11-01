package com.example.liubo.olderhome.entity;

import java.util.Date;

public class Notice {
    private Integer id;

    private String content;

    private Date pulishdate;

    private Integer adminId;

    public Notice(Integer id, String content, Date pulishdate, Integer adminId) {
        this.id = id;
        this.content = content;
        this.pulishdate = pulishdate;
        this.adminId = adminId;
    }

    public Notice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPulishdate() {
        return pulishdate;
    }

    public void setPulishdate(Date pulishdate) {
        this.pulishdate = pulishdate;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}