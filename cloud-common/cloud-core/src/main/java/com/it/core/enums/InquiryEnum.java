package com.it.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum InquiryEnum {

    /**
     * 1 是  0 否
     */
    NO(0),
    YES(1);

    private final Integer code;
}
