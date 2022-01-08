package com.it.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {
    /**
     * 状态
     */
    SUCCESS(0, "成功"),
    FAIL(1, "失败");

    private final Integer code;
    private final String desc;
}