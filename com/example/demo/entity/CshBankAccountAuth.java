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
@TableName("csh_bank_account_auth")
public class CshBankAccountAuth extends DomainObject {

	private Long id;
	@TableField("bank_account_id")
	private Long bankAccountId;
	@TableField("company_id")
	private String companyId;
	@TableField("unit_id")
	private String unitId;
	@TableField("job_id")
	private String jobId;
	@TableField("employee_id")
	private String employeeId;
	@TableField("date_from")
	private Date dateFrom;
	@TableField("date_to")
	private Date dateTo;
	@TableField("province_code")
	private String provinceCode;
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
		return "CshBankAccountAuth{" +
			"id=" + id +
			", bankAccountId=" + bankAccountId +
			", companyId=" + companyId +
			", unitId=" + unitId +
			", jobId=" + jobId +
			", employeeId=" + employeeId +
			", dateFrom=" + dateFrom +
			", dateTo=" + dateTo +
			", provinceCode=" + provinceCode +
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
