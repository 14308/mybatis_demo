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
@TableName("csh_bank_branch")
public class CshBankBranch extends DomainObject {

	private Long id;
	@TableField("company_id")
	private Long companyId;
	@TableField("bank_code")
	private String bankCode;
	@TableField("bank_branch_code")
	private String bankBranchCode;
	@TableField("bank_branch_name")
	private String bankBranchName;
	private String phone;
	@TableField("contact_name")
	private String contactName;
	private String email;
	private String address;
	@TableField("city_code")
	private String cityCode;
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
		return "CshBankBranch{" +
			"id=" + id +
			", companyId=" + companyId +
			", bankCode=" + bankCode +
			", bankBranchCode=" + bankBranchCode +
			", bankBranchName=" + bankBranchName +
			", phone=" + phone +
			", contactName=" + contactName +
			", email=" + email +
			", address=" + address +
			", cityCode=" + cityCode +
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
