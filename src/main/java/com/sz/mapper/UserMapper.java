package com.sz.mapper;

import com.sz.pojo.UserWithDetail;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    UserWithDetail queryById(@Param("id") Integer id);

    UserWithDetail queryByIdStep(@Param("id")Integer id);
}
