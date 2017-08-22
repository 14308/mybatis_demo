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
 * <p>
 * ???????
 * </p>
 *
 * @author Yanghu
 * @since 2017-08-21
 */
@Data
@TableName("BGT_CONTROL_STRATEGY_GROUP")
public class ControlStrategyGroup {

	private Long id;
    /**
     * ????id
     */
	@TableField("organization_id")
	private Long organizationId;
    /**
     * ??????
     */
	@TableField("control_strategy_group_code")
	private String controlStrategyGroupCode;
    /**
     * ??????
     */
	@TableField("control_strategy_group_name")
	private String controlStrategyGroupName;
    /**
     * ??
     */
	private String description;
	@TableField("is_enabled")
	private Boolean isEnabled;
	@TableField("is_deleted")
	private Boolean isDeleted;
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
		return "ControlStrategyGroup{" +
			"id=" + id +
			", organizationId=" + organizationId +
			", controlStrategyGroupCode=" + controlStrategyGroupCode +
			", controlStrategyGroupName=" + controlStrategyGroupName +
			", description=" + description +
			", isEnabled=" + isEnabled +
			", isDeleted=" + isDeleted +
			", createdDate=" + createdDate +
			", createdBy=" + createdBy +
			", lastUpdatedDate=" + lastUpdatedDate +
			", lastUpdatedBy=" + lastUpdatedBy +
			"}";
	}
}
