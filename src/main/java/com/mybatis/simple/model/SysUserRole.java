package com.mybatis.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole implements Serializable {
    private Long userId;
    private Long roleId;
}
