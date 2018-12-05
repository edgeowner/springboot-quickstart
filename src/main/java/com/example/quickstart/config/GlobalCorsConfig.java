/*
 * Filename:  EnterpriseUserController.java
 *
 * Description:
 * Version:  1.0
 * Created:  11/13/18 3:31 PM
 * Editor:  IntelliJ Idea (ts=4,sw=4,et)
 * Author:  weijiang, wei.jiang@atmatrix.org
 * Company:  Atmatrix.org
 *
 * History:
 *     1. Date:
 *         Author: zhangsunny
 *         Modification:
 *
 * Copyright 2018, Shanghai Shangzhen Intelligence Tech Co. Ltd. (Atmatrix.org).
 * All Rights Reserved.
 */
package com.example.quickstart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            //重写父类提供的跨域请求处理的接口
            public void addCorsMappings(CorsRegistry registry) {
                //添加映射路径
                registry.addMapping("/**")
                        //放行哪些原始域
                        .allowedOrigins("*")
                        //是否发送Cookie信息
                        .allowCredentials(true)
                        //放行哪些原始域(请求方式)
                        .allowedMethods("GET","POST", "PUT", "DELETE")
                        //放行哪些原始域(头部信息)
                        .allowedHeaders("*")
                        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
                        .exposedHeaders("Header1", "Header2");
            }
        };
    }
}
