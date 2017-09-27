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
@TableName("csh_bank_account")
public class CshBankAccount extends DomainObject {

	private Long id;
	@TableField("bank_account_name")
	private Long bankAccountName;
	@TableField("bank_account_num")
	private String bankAccountNum;
	@TableField("bank_branch_id")
	private Long bankBranchId;
	@TableField("company_id")
	private Long companyId;
	@TableField("city_name")
	private String cityName;
	@TableField("city_code")
	private String cityCode;
	@TableField("province_name")
	private String provinceName;
	@TableField("province_code")
	private String provinceCode;
	@TableField("cash_account_id")
	private Long cashAccountId;
	@TableField("responsibility_center_id")
	private Long responsibilityCenterId;
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
		return "CshBankAccount{" +
			"id=" + id +
			", bankAccountName=" + bankAccountName +
			", bankAccountNum=" + bankAccountNum +
			", bankBranchId=" + bankBranchId +
			", companyId=" + companyId +
			", cityName=" + cityName +
			", cityCode=" + cityCode +
			", provinceName=" + provinceName +
			", provinceCode=" + provinceCode +
			", cashAccountId=" + cashAccountId +
			", responsibilityCenterId=" + responsibilityCenterId +
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
