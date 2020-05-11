package com.top.bi.entity;

public class PosUploadRule {
    public PosUploadRule() {
    }

    @Override
    public String toString() {
        return "PosUploadRule{" +
                "pos_code='" + pos_code + '\'' +
                ", pos_file='" + pos_file + '\'' +
                ", ziduan='" + ziduan + '\'' +
                '}';
    }

    private String pos_code;
    private String pos_file;
    private String ziduan;

    public String getZiduan() {
        return ziduan;
    }

    public void setZiduan(String ziduan) {
        this.ziduan = ziduan;
    }

    public String getPos_file() {
        return pos_file;
    }

    public void setPos_file(String pos_file) {
        this.pos_file = pos_file;
    }

    public String getPos_code() {
        return pos_code;
    }

    public void setPos_code(String pos_code) {
        this.pos_code = pos_code;
    }
}
