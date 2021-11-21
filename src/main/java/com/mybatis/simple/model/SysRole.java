package com.mybatis.simple.model;

import com.mybatis.simple.type.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRole implements Serializable {
    private Long id;
    private String roleName;
    private Enabled enabled;
    private Long createBy;
    private Date createTime;
    List<SysPrivilege> privilegeList;
}
