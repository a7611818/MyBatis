package com.sz.mapper;

import com.sz.pojo.UserDetail;
import org.apache.ibatis.annotations.Param;

public interface UserDetailMapper {
    UserDetail queryByUserId(@Param("id")Integer id);

    UserDetail queryByUserId2(@Param("id") Integer id);
}
