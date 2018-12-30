package com.sz.com.sz;

import com.sz.mapper.UserMapper;
import com.sz.pojo.UserWithDetail;
import com.sz.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestDynamicSQL {

    @Test
    public void ml(){
        SqlSession sqlsession = MyBatisUtil.getSession();

        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        UserWithDetail userWithDetail = mapper.queryByIdStep(1);

        System.out.println(userWithDetail);
        sqlsession.close();

    }
}
