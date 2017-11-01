package com.example.liubo.olderhome.entity;

import java.util.Date;

public class People {
    private Integer id;

    private String proplename;

    private String peopleage;

    private String peoplesex;

    private String peopleadress;

    private Date peoplebirth;

    private String peoplenum;

    public People(Integer id, String proplename, String peopleage, String peoplesex, String peopleadress, Date peoplebirth, String peoplenum) {
        this.id = id;
        this.proplename = proplename;
        this.peopleage = peopleage;
        this.peoplesex = peoplesex;
        this.peopleadress = peopleadress;
        this.peoplebirth = peoplebirth;
        this.peoplenum = peoplenum;
    }

    public People() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProplename() {
        return proplename;
    }

    public void setProplename(String proplename) {
        this.proplename = proplename == null ? null : proplename.trim();
    }

    public String getPeopleage() {
        return peopleage;
    }

    public void setPeopleage(String peopleage) {
        this.peopleage = peopleage == null ? null : peopleage.trim();
    }

    public String getPeoplesex() {
        return peoplesex;
    }

    public void setPeoplesex(String peoplesex) {
        this.peoplesex = peoplesex == null ? null : peoplesex.trim();
    }

    public String getPeopleadress() {
        return peopleadress;
    }

    public void setPeopleadress(String peopleadress) {
        this.peopleadress = peopleadress == null ? null : peopleadress.trim();
    }

    public Date getPeoplebirth() {
        return peoplebirth;
    }

    public void setPeoplebirth(Date peoplebirth) {
        this.peoplebirth = peoplebirth;
    }

    public String getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(String peoplenum) {
        this.peoplenum = peoplenum == null ? null : peoplenum.trim();
    }
}