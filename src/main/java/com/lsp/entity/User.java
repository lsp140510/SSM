package com.lsp.entity;

public class User {
    private int tid;
    private String tname;

    //实体中的字段名数量要和数据表中的一模一样
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
