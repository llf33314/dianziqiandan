package com.gt.pojo;

public class TRegister {
    private Integer tId;

    private String tAccount;						//用户名

    private String tPassword;						//用户密码

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettAccount() {
        return tAccount;
    }

    public void settAccount(String tAccount) {
        this.tAccount = tAccount == null ? null : tAccount.trim();
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }
}