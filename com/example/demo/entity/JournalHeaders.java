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
@TableName("bgt_journal_headers")
public class JournalHeaders {

	private Long id;
    /**
     * ??ID
     */
	@TableField("company_id")
	private Long companyId;
    /**
     * ????ID
     */
	@TableField("operation_unit_id")
	private Long operationUnitId;
    /**
     * ????ID
     */
	@TableField("organisation_id")
	private Long organisationId;
    /**
     * ???ID
     */
	@TableField("structure_id")
	private Long structureId;
    /**
     * ?????
     */
	@TableField("journal_number")
	private String journalNumber;
    /**
     * ??
     */
	@TableField("period_year")
	private Integer periodYear;
    /**
     * ??
     */
	@TableField("period_quarter")
	private Long periodQuarter;
    /**
     * ??
     */
	@TableField("period_name")
	private String periodName;
    /**
     * ???
     */
	@TableField("DESCRIPTION")
	private String description;
    /**
     * ??ID
     */
	@TableField("scenario_id")
	private Long scenarioId;
    /**
     * ??ID
     */
	@TableField("version_id")
	private Long versionId;
    /**
     * ??
     */
	private String status;
    /**
     * ????
     */
	@TableField("reversed_flag")
	private String reversedFlag;
    /**
     * ??????ID
     */
	@TableField("source_budget_header_id")
	private Long sourceBudgetHeaderId;
    /**
     * ????
     */
	@TableField("source_type")
	private String sourceType;
    /**
     * ???????ID
     */
	@TableField("journal_type_id")
	private Long journalTypeId;
    /**
     * ??ID
     */
	@TableField("employee_id")
	private Long employeeId;
    /**
     * ??ID
     */
	@TableField("position_id")
	private Long positionId;
    /**
     * ??ID
     */
	@TableField("unit_id")
	private Long unitId;
    /**
     * ????
     */
	@TableField("is_enabled")
	private Boolean isEnabled;
    /**
     * ????
     */
	@TableField("is_deleted")
	private Boolean isDeleted;
    /**
     * ????
     */
	@TableField("created_date")
	private Date createdDate;
    /**
     * ????ID
     */
	@TableField("created_by")
	private Long createdBy;
    /**
     * ??????
     */
	@TableField("last_updated_date")
	private Date lastUpdatedDate;
    /**
     * ??????ID
     */
	@TableField("last_updated_by")
	private Long lastUpdatedBy;


	@Override
	public String toString() {
		return "JournalHeaders{" +
			"id=" + id +
			", companyId=" + companyId +
			", operationUnitId=" + operationUnitId +
			", organisationId=" + organisationId +
			", structureId=" + structureId +
			", journalNumber=" + journalNumber +
			", periodYear=" + periodYear +
			", periodQuarter=" + periodQuarter +
			", periodName=" + periodName +
			", description=" + description +
			", scenarioId=" + scenarioId +
			", versionId=" + versionId +
			", status=" + status +
			", reversedFlag=" + reversedFlag +
			", sourceBudgetHeaderId=" + sourceBudgetHeaderId +
			", sourceType=" + sourceType +
			", journalTypeId=" + journalTypeId +
			", employeeId=" + employeeId +
			", positionId=" + positionId +
			", unitId=" + unitId +
			", isEnabled=" + isEnabled +
			", isDeleted=" + isDeleted +
			", createdDate=" + createdDate +
			", createdBy=" + createdBy +
			", lastUpdatedDate=" + lastUpdatedDate +
			", lastUpdatedBy=" + lastUpdatedBy +
			"}";
	}
}
