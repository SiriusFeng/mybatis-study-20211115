package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysPrivilege;
import com.mybatis.simple.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrivilegeMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();
        try {
            PrivilegeMapper privilegeMapper = sqlSession.getMapper(PrivilegeMapper.class);
            SysPrivilege privilege = privilegeMapper.selectById(1L);
            Assert.assertNotNull(privilege);
            Assert.assertEquals("用户管理", privilege.getPrivilegeName());
        } finally {
            sqlSession.rollback();
            //sqlSession.commit();
            sqlSession.close();
        }
    }
}
