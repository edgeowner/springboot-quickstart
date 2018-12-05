package com.example.quickstart.core.model;


import lombok.Data;

/**
 * User信息
 */
@Data
public class UserInfo {

    private String userId;
    private String username;
    private String password;
    private Integer userType;
}
