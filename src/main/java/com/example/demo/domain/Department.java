package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by 陆小凤 on 2017/7/20.
 */
@Data
@TableName("atl_department")
@JsonPropertyOrder({
        "id",
        "name",
        "code",
        "createdDate",
        "status"
})
public class Department {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField(value = "department_name",validate = FieldStrategy.NOT_NULL)
    private String name;
    private String code;
    @TableField(value = "createdDate",validate = FieldStrategy.NOT_NULL)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssz", timezone = "GMT+8")
    private ZonedDateTime createdDate;
    @TableField(value = "departemtn_status",validate = FieldStrategy.NOT_NULL)
    private DepartmentStatus status;
}
