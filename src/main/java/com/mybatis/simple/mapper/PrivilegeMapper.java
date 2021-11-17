package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysPrivilege;
import com.mybatis.simple.provider.PrivilegeProvider;
import org.apache.ibatis.annotations.SelectProvider;

public interface PrivilegeMapper {

    @SelectProvider(type = PrivilegeProvider.class, method = "selectById")
    SysPrivilege selectById(Long id);
}
