package com.solo.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Member {
    private String userName = "sdr4linux";
    private String password = "123456";
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date myDate;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
