package com.example.liubo.olderhome.entity;

public class Type {
    private Integer id;

    private String servicetype;

    private Integer serviceid;

    public Type(Integer id, String servicetype, Integer serviceid) {
        this.id = id;
        this.servicetype = servicetype;
        this.serviceid = serviceid;
    }

    public Type() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }
}