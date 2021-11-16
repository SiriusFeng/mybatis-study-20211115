package com.mybatis.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysPrivilege implements Serializable {
    private Long id;
    private String privilegeName;
    private String privilegeUrl;
}
