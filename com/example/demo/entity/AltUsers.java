package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("alt_users")
public class AltUsers {

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String password;
	private String username;


	@Override
	public String toString() {
		return "AltUsers{" +
			"id=" + id +
			", password=" + password +
			", username=" + username +
			"}";
	}
}
