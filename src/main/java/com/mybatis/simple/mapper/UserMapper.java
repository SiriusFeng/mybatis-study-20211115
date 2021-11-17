package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysRole;
import com.mybatis.simple.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
    List<SysRole> selectRolesBySysUserId(Long userId);
    int insert(SysUser sysUser);
    int insert2(SysUser sysUser);
    int insert3(SysUser sysUser);
    int updateById(SysUser sysUser);
    int deleteById(Long id);
    List<SysRole> selectRolesByUserIdAndEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);
}
