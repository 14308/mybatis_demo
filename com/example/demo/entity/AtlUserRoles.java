package com.example.demo.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.enums.FieldFill;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dong.liu on 2017-08-22
 */
@Data
@TableName("atl_user_roles")
public class AtlUserRoles {

	@TableField("user_id")
	private Long userId;
	@TableField("role_id")
	private Long roleId;


	@Override
	public String toString() {
		return "AtlUserRoles{" +
			"userId=" + userId +
			", roleId=" + roleId +
			"}";
	}
}
