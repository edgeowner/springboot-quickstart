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
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CORSConfiguration {
    @Bean
    public CorsFilter corsFilter() {
        //1.添加CORS配置信息
        CorsConfiguration config = new CorsConfiguration();
        //放行哪些原始域
        config.addAllowedOrigin("*");
        //是否发送Cookie信息
        config.setAllowCredentials(true);
        //放行哪些原始域(请求方式)
        config.addAllowedMethod("*");
        //放行哪些原始域(头部信息)
        config.addAllowedHeader("*");
        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
//        config.addExposedHeader("*");

        //2.添加映射路径
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        //3.返回新的CorsFilter.
        return new CorsFilter(configSource);
    }
}
