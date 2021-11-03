package com.kip.backtothepast.biz.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Dcy
 */
@Data
@TableName("user")
public class User {

    @ApiModelProperty("id")
    @TableId(value = "id" , type = IdType.ASSIGN_UUID)
    private String id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("电子邮箱")
    private String email;
}
