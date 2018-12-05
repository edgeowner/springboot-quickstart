package com.example.quickstart.config;

import com.example.quickstart.service.UserService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class InitConfig implements ApplicationRunner {
    @Resource
    private
    UserService initService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initService.initSSOUser();
    }
}
