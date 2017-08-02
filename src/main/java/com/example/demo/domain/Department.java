package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.time.ZonedDateTime;

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
public class Department implements Serializable,keyToStringDome {

    private static final long serialVersionUID=11l;


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

    public Department(Long id, String name, String code, DepartmentStatus status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.status = status;
    }

    public Department() {

    }

   /* @Override
    public String toString() {
        return "id=" + id;
    }*/
    @Override
    public String keyToString() {
        return "id="+id;
    }
}
