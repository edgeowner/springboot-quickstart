package com.example.quickstart.dao.po;

import java.util.Date;

public class UserSso {
    private Long id;

    private Long userId;

    private String password;

    private Date createTime;

    private Date updateTime;

    public UserSso(Long id, Long userId, String password, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserSso() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}