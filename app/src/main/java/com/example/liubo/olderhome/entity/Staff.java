package com.example.liubo.olderhome.entity;

import java.util.Date;

public class Staff {
    private Integer id;

    private String staffname;

    private String staffadress;

    private String staffnum;

    private String staffsex;

    private Date staffbirth;

    public Staff(Integer id, String staffname, String staffadress, String staffnum, String staffsex, Date staffbirth) {
        this.id = id;
        this.staffname = staffname;
        this.staffadress = staffadress;
        this.staffnum = staffnum;
        this.staffsex = staffsex;
        this.staffbirth = staffbirth;
    }

    public Staff() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffadress() {
        return staffadress;
    }

    public void setStaffadress(String staffadress) {
        this.staffadress = staffadress == null ? null : staffadress.trim();
    }

    public String getStaffnum() {
        return staffnum;
    }

    public void setStaffnum(String staffnum) {
        this.staffnum = staffnum == null ? null : staffnum.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public Date getStaffbirth() {
        return staffbirth;
    }

    public void setStaffbirth(Date staffbirth) {
        this.staffbirth = staffbirth;
    }
}