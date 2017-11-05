package com.example.liubo.olderhome.entity;

public class Service {
    private Integer id;

    private String context;

    private String sername;

    private String serviceTcol;

    private String evaluation;

    private int coin;

    public Service(Integer id, String context, String sername, String serviceTcol, String evaluation, int coin) {
        this.id = id;
        this.context = context;
        this.sername = sername;
        this.serviceTcol = serviceTcol;
        this.evaluation = evaluation;
        this.coin = coin;
    }

    public Service() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername == null ? null : sername.trim();
    }

    public String getServiceTcol() {
        return serviceTcol;
    }

    public void setServiceTcol(String serviceTcol) {
        this.serviceTcol = serviceTcol == null ? null : serviceTcol.trim();
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}