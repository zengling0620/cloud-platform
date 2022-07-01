package com.it.core.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.it.core.supper.SuperEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zlt
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role")
public class SysRole extends SuperEntity<SysRole> {
    private static final long serialVersionUID = 4497149010220586111L;
    private String code;
    private String name;
    @TableField(exist = false)
    private Long userId;
    @TableField(exist = false)
    private String userCode;
}
