package com.sz;

import com.sz.mapper.UserMapper;
import com.sz.pojo.UserBlog;
import com.sz.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestDynamicSQL {

    @Test
    public void ml(){
        SqlSession sqlsession = MyBatisUtil.getSession();

        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        UserBlog userWithDetail = mapper.queryByIdWithBlog(1);

        System.out.println(userWithDetail);
        sqlsession.close();

    }
}
