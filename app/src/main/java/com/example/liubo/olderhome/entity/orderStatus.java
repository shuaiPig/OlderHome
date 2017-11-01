package com.example.liubo.olderhome.entity;

import java.util.Date;

public class orderStatus {
    private Integer id;

    private Integer orderid;

    private Integer orderstatus;

    private Date orderdate;

    private Date ordereddate;

    private Date escdate;

    private Date falsedate;

    private Date ordersuccess;

    private Date okdate;

    public orderStatus(Integer id, Integer orderid, Integer orderstatus, Date orderdate, Date ordereddate, Date escdate, Date falsedate, Date ordersuccess, Date okdate) {
        this.id = id;
        this.orderid = orderid;
        this.orderstatus = orderstatus;
        this.orderdate = orderdate;
        this.ordereddate = ordereddate;
        this.escdate = escdate;
        this.falsedate = falsedate;
        this.ordersuccess = ordersuccess;
        this.okdate = okdate;
    }

    public orderStatus() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getOrdereddate() {
        return ordereddate;
    }

    public void setOrdereddate(Date ordereddate) {
        this.ordereddate = ordereddate;
    }

    public Date getEscdate() {
        return escdate;
    }

    public void setEscdate(Date escdate) {
        this.escdate = escdate;
    }

    public Date getFalsedate() {
        return falsedate;
    }

    public void setFalsedate(Date falsedate) {
        this.falsedate = falsedate;
    }

    public Date getOrdersuccess() {
        return ordersuccess;
    }

    public void setOrdersuccess(Date ordersuccess) {
        this.ordersuccess = ordersuccess;
    }

    public Date getOkdate() {
        return okdate;
    }

    public void setOkdate(Date okdate) {
        this.okdate = okdate;
    }
}