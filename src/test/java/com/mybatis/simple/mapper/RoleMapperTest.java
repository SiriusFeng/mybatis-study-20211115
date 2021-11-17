package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RoleMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole role = roleMapper.selectById(1L);
            Assert.assertNotNull(role);
            Assert.assertEquals("管理员", role.getRoleName());
        } finally {
            sqlSession.rollback();
            //sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testSelectById2(){
        SqlSession sqlSession = getSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole role = roleMapper.selectById2(1L);
            Assert.assertNotNull(role);
            Assert.assertEquals("管理员", role.getRoleName());
        } finally {
            sqlSession.rollback();
            //sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<SysRole> roleList = roleMapper.selectAll();
            Assert.assertNotNull(roleList);
            Assert.assertNotNull(roleList.get(0).getRoleName());
        } finally {
            sqlSession.rollback();
            //sqlSession.commit();
            sqlSession.close();
        }
    }
}
