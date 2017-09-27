package com.example.demo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.helioscloud.atlantis.domain.DomainObject;
import com.baomidou.mybatisplus.enums.FieldFill;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dong.liu on 2017-09-05
 */
@Data
@TableName("budget_version_assign_company")
public class BudgetVersionAssignCompany extends DomainObject {

	private Long id;
	@TableField("company_id")
	private Long companyId;
	@TableField("version_id")
	private String versionId;
	@TableField("version_number")
	private Integer versionNumber;
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
		return "BudgetVersionAssignCompany{" +
			"id=" + id +
			", companyId=" + companyId +
			", versionId=" + versionId +
			", versionNumber=" + versionNumber +
			", isEnabled=" + isEnabled +
			", isDeleted=" + isDeleted +
			", createdDate=" + createdDate +
			", createdBy=" + createdBy +
			", lastUpdatedDate=" + lastUpdatedDate +
			", lastUpdatedBy=" + lastUpdatedBy +
			"}";
	}
}
