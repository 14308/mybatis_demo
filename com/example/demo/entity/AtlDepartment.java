package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
@TableName("atl_department")
public class AtlDepartment {

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("department_name")
	private String departmentName;
	private String code;
	@TableField("departemtn_status")
	private Integer departemtnStatus;
	private Date createdDate;


	@Override
	public String toString() {
		return "AtlDepartment{" +
			"id=" + id +
			", departmentName=" + departmentName +
			", code=" + code +
			", departemtnStatus=" + departemtnStatus +
			", createdDate=" + createdDate +
			"}";
	}
}
