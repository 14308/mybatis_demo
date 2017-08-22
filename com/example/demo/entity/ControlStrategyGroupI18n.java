package com.example.demo.entity;

import java.util.Date;
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
@TableName("bgt_control_strategy_group_i18n")
public class ControlStrategyGroupI18n {

	private Long id;
	private String lang;
	@TableField("control_strategy_name")
	private String controlStrategyName;
	@TableField("created_date")
	private Date createdDate;
	@TableField("last_updated_by")
	private Long lastUpdatedBy;


	@Override
	public String toString() {
		return "ControlStrategyGroupI18n{" +
			"id=" + id +
			", lang=" + lang +
			", controlStrategyName=" + controlStrategyName +
			", createdDate=" + createdDate +
			", lastUpdatedBy=" + lastUpdatedBy +
			"}";
	}
}
