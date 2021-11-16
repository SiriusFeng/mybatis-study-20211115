package com.mybatis.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRolePrivilege implements Serializable {
    private Long roleId;
    private Long privilegeId;
}
