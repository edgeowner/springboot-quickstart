package com.example.quickstart.dao;

import com.example.quickstart.dao.po.UserSso;
import com.example.quickstart.dao.po.UserSsoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSsoMapper {
    long countByExample(UserSsoExample example);

    int insert(UserSso record);

    int insertSelective(UserSso record);

    List<UserSso> selectByExample(UserSsoExample example);

    int updateByExampleSelective(@Param("record") UserSso record, @Param("example") UserSsoExample example);

    int updateByExample(@Param("record") UserSso record, @Param("example") UserSsoExample example);
}