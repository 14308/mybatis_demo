package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/19.
 */
//@Builder //使用Buider方法给user实体赋值
@Data   //自动注入get set方法 加此注释变成一个实体类
@TableName("atl_user")
public class User implements Serializable,UserDetails {
    private static final long serialVersionUID=1l;
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField(value = "name")
    private String username;
    @TableField(value = "password")
    private String password;
    @TableField(value = "departement_id")
    private Long departement_id;
    @TableField(value = "full_name")
    private String full_name;

    public User(){}

    public User(Long id, Long departement_id, String username, String password, String full_name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.departement_id = departement_id;
        this.full_name = full_name;
    }

    @TableField(exist = false)
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        auths.add(new SimpleGrantedAuthority(this.username));
        return auths;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}