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
@TableName("atl_role")
public class AtlRole {

	private Long id;
	@TableField("role_name")
	private String roleName;


	@Override
	public String toString() {
		return "AtlRole{" +
			"id=" + id +
			", roleName=" + roleName +
			"}";
	}
}
