package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("atl_user")
public class AtlUser {

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("departement_id")
	private Long departementId;
	private String name;
	private String password;
	@TableField("full_name")
	private String fullName;


	@Override
	public String toString() {
		return "AtlUser{" +
			"id=" + id +
			", departementId=" + departementId +
			", name=" + name +
			", password=" + password +
			", fullName=" + fullName +
			"}";
	}
}
