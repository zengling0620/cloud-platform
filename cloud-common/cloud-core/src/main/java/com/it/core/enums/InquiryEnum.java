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
  YES(1),
  NO(0);

  private final int code;
}
