package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * Created by 陆小凤 on 2017/8/2.
 */
@Data
@TableName("atl_role")
public class Role {
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(value = "role_name", validate = FieldStrategy.NOT_NULL)
    private String name;
}
