package com.example.quickstart.service.impl;

import com.example.quickstart.core.model.UserInfo;
import com.example.quickstart.core.result.ReturnT;
import com.example.quickstart.service.UserService;
import com.example.quickstart.util.PasswordProvider;
import com.example.quickstart.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    @Override
    public ReturnT<UserInfo> findUser(String username, String password) {
        return null;
    }

    @Override
    public void initSSOUser() {
////        List<UserBase> all = userBaseMapper.getAll();
//        List<SSOUser> toInsert = new ArrayList<>();
//        SSOUser ssoUser;
//        for (UserBase userBase : all) {
//            ssoUser = new SSOUser();
//            ssoUser.setUserId(userBase.getId());
//            ssoUser.setPassword(PasswordProvider.encrypt(userBase.getId() + ""));
//            toInsert.add(ssoUser);
//        }
//        if (!CollectionUtils.isEmpty(toInsert)) {
//            ssoUserMapper.batchInsert(toInsert);
//        }


    }


}
