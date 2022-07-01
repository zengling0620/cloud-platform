package com.it.core.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel
public class PageQuery<T> {

    @Min(value = 1, message = "分页页码不能小于1")
    @ApiModelProperty(value = "分页页码", example = "1")
    private Integer pageIndex = 1;
    @Min(value = 1, message = "页面大小不能小于1")
    @ApiModelProperty(value = "页面大小", example = "10")
    private Integer pageSize = 10;
    private T params;
}
