package com.example.quickstart.dao;

import com.example.quickstart.dao.po.UserBasic;
import com.example.quickstart.dao.po.UserBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBasicMapper {
    long countByExample(UserBasicExample example);

    int insert(UserBasic record);

    int insertSelective(UserBasic record);

    List<UserBasic> selectByExample(UserBasicExample example);

    int updateByExampleSelective(@Param("record") UserBasic record, @Param("example") UserBasicExample example);

    int updateByExample(@Param("record") UserBasic record, @Param("example") UserBasicExample example);
}