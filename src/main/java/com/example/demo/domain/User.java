package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 陆小凤 on 2017/7/19.
 */
//@Builder //使用Buider方法给user实体赋值
@Data   //自动注入get set方法 加此注释变成一个实体类
@TableName("atl_user")
public class User{
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField(value = "name",validate = FieldStrategy.NOT_NULL)
    private String username;
    @TableField(value = "password",validate = FieldStrategy.NOT_NULL)
    private String password;
    @TableField(value = "departement_id",validate = FieldStrategy.NOT_NULL)
    private Long departement_id;
    @TableField(value = "full_name")
    private String full_name;

    public User(Long id, Long departement_id, String username, String password, String full_name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.departement_id = departement_id;
        this.full_name = full_name;
    }
}