package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

@CacheNamespaceRef(RoleMapper.class)
public interface RoleMapper {

    @Select({"select id,role_name,enabled,create_by,create_time ",
            "from sys_role ",
            "where id = #{id}"})
    SysRole selectById(Long id);

    @Results(id = "roleResultMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "roleName", column = "role_name"),
            @Result(property = "enabled", column = "enabled"),
            @Result(property = "createBy", column = "create_by"),
            @Result(property = "createTime", column = "create_time"),
    })
    @Select({"select id,role_name,enabled,create_by,create_time ",
            "from sys_role ",
            "where id = #{id}"})
    SysRole selectById2(Long id);

    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> selectAll();

    List<SysRole> selectRoleByUserId(Long userId);

    List<SysRole> selectAllRoleAndPrivilege();
    List<SysRole> selectRoleByUserIdChoose(Long userId);

    int updateByRole(@Param("role") SysRole role);
}
