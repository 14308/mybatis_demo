package com.example.demo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.enums.FieldFill;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dong.liu on 2017-08-22
 */
@Data
public class Asd {

	private Integer from;
	private String name;
	private String code;


	@Override
	public String toString() {
		return "Asd{" +
			"from=" + from +
			", name=" + name +
			", code=" + code +
			"}";
	}
}
