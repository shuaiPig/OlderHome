package com.example.liubo.olderhome.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer serviceid;

    private Date starttime;

    private Date endtime;

    private String adress;

    private String evaluation;

    private Integer userid;

    private Integer staffid;

    private Integer adminid;

    private Integer paystatus;

    public Order(Integer id, Integer serviceid, Date starttime, Date endtime, String adress, String evaluation, Integer userid, Integer staffid, Integer adminid, Integer paystatus) {
        this.id = id;
        this.serviceid = serviceid;
        this.starttime = starttime;
        this.endtime = endtime;
        this.adress = adress;
        this.evaluation = evaluation;
        this.userid = userid;
        this.staffid = staffid;
        this.adminid = adminid;
        this.paystatus = paystatus;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }
}