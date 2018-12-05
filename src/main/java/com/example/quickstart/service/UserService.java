package com.example.quickstart.service;

import com.example.quickstart.core.result.ReturnT;
import com.example.quickstart.core.model.UserInfo;

public interface UserService {

    public ReturnT<UserInfo> findUser(String username, String password);

    void initSSOUser();
}
