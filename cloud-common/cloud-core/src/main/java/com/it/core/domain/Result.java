package com.it.core.domain;

import com.it.core.enums.InquiryEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "接口返回对象", description = "接口返回对象")
public class Result<T> {

    @ApiModelProperty(value = "响应状态码 0-成功 非0-失败")
    private Integer code;
    @ApiModelProperty(value = "响应标志 true-成功 false-失败")
    private Boolean status;
    @ApiModelProperty(value = "响应消息")
    private String message;
    @ApiModelProperty(value = "响应数据")
    private T data;
    @ApiModelProperty(value = "响应时间戳")
    private Long timestamp;

    /**
     * 响应成功
     *
     * @return 响应成功
     */
    public static <T> Result<T> success() {
        return of(InquiryEnum.YES.getCode(), "响应成功", null);
    }

    /**
     * 响应成功有响应数据
     *
     * @return 响应成功
     */
    public static <T> Result<T> success(T data) {
        return of(InquiryEnum.YES.getCode(), "响应成功", data);
    }

    public static <T> Result<T> success(T data, String message) {
        return of(InquiryEnum.YES.getCode(), message, data);
    }

    public static <T> Result<T> failed() {
        return of(InquiryEnum.NO.getCode(), "响应失败", null);
    }

    public static <T> Result<T> failed(T data) {
        return of(InquiryEnum.NO.getCode(), "响应失败", data);
    }

    public static <T> Result<T> failed(T data, String message) {
        return of(InquiryEnum.NO.getCode(), message, data);
    }

    public static <T> Result<T> of(Integer code, String message, T data) {
        Long time = System.currentTimeMillis();
        boolean status = InquiryEnum.YES.getCode().equals(code);
        return new Result<>(code, status, message, data, time);
    }
}
