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
@TableName("budget_control_strategy")
public class BudgetControlStrategy {

	private Long id;
    /**
     * ????id
     */
	@TableField("organization_id")
	private Long organizationId;
    /**
     * ??????
     */
	@TableField("control_strategy_code")
	private String controlStrategyCode;
    /**
     * ??????
     */
	@TableField("control_strategy_name")
	private String controlStrategyName;
    /**
     * ??
     */
	private String description;
	@TableField("is_enabled")
	private Boolean isEnabled;
	@TableField("is_deleted")
	private Boolean isDeleted;
	@TableField("version_number")
	private Long versionNumber;
	@TableField("created_date")
	private Date createdDate;
	@TableField("created_by")
	private Long createdBy;
	@TableField("last_updated_date")
	private Date lastUpdatedDate;
	@TableField("last_updated_by")
	private Long lastUpdatedBy;


	@Override
	public String toString() {
		return "BudgetControlStrategy{" +
			"id=" + id +
			", organizationId=" + organizationId +
			", controlStrategyCode=" + controlStrategyCode +
			", controlStrategyName=" + controlStrategyName +
			", description=" + description +
			", isEnabled=" + isEnabled +
			", isDeleted=" + isDeleted +
			", versionNumber=" + versionNumber +
			", createdDate=" + createdDate +
			", createdBy=" + createdBy +
			", lastUpdatedDate=" + lastUpdatedDate +
			", lastUpdatedBy=" + lastUpdatedBy +
			"}";
	}
}
