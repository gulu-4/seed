package com.seed.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DutyCreateVO {

    @ApiModelProperty(value = "姓名")
    private String name;

}
