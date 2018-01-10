package com.iemr.mmu.data.ncdScreening;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "t_ncdscreening")
public class NCDScreening {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Expose
	@Column(name = "ID")
	private Long ID;  
	
	@Expose
	@Column(name = "BeneficiaryRegID")
	private Long beneficiaryRegID; 
	
	@Expose
	@Column(name = "BenVisitID")
	private Long benVisitID;
	
	@Expose
	@Column(name = "ProviderServiceMapID")
	private Integer providerServiceMapID; 
	
	@Expose
	@Column(name = "VisitCode")
	private Long visitCode;
	
	@Expose
	@Column(name = "NCDScreeningVisitNo")
	private Short ncdScreeningVisitNo;
	
	@Expose
	@Column(name = "NCDScreeningConditionID")
	private Integer ncdScreeningConditionID;
	
	@Expose
	@Column(name = "ScreeningCondition")
	private String screeningCondition; 
	
	@Expose
	@Column(name = "NCDScreeningReasonID")
	private Integer ncdScreeningReasonID;
	
	@Expose
	@Column(name = "ReasonForScreening")
	private String reasonForScreening;
	
	@Expose
	@Column(name = "NextScreeningDate")
	private Timestamp nextScreeningDate;
	
	@Expose
	@Column(name = "ActionForScreenPositive")
	private String actionForScreenPositive;
	
	@Expose
	@Column(name = "IsScreeningComplete")
	private Boolean isScreeningComplete;
	
	@Expose
	@Column(name = "Deleted", insertable = false, updatable = true)
	private Boolean deleted;

	@Expose
	@Column(name = "Processed", insertable = false, updatable = true)
	private String processed;

	@Expose
	@Column(name = "CreatedBy")
	private String createdBy;

	@Expose
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;

	@Expose
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Expose
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;
	
	public Long getId() {
		return ID;
	}

	public void setId(Long id) {
		this.ID = id;
	}

	public Long getBeneficiaryRegID() {
		return beneficiaryRegID;
	}

	public void setBeneficiaryRegID(Long beneficiaryRegID) {
		this.beneficiaryRegID = beneficiaryRegID;
	}

	public Long getBenVisitID() {
		return benVisitID;
	}

	public void setBenVisitID(Long benVisitID) {
		this.benVisitID = benVisitID;
	}

	public Integer getProviderServiceMapID() {
		return providerServiceMapID;
	}

	public void setProviderServiceMapID(Integer providerServiceMapID) {
		this.providerServiceMapID = providerServiceMapID;
	}

	public Long getVisitCode() {
		return visitCode;
	}

	public void setVisitCode(Long visitCode) {
		this.visitCode = visitCode;
	}

	public Short getNcdScreeningVisitNo() {
		return ncdScreeningVisitNo;
	}

	public void setNcdScreeningVisitNo(Short ncdScreeningVisitNo) {
		this.ncdScreeningVisitNo = ncdScreeningVisitNo;
	}

	public Integer getNcdScreeningConditionID() {
		return ncdScreeningConditionID;
	}

	public void setNcdScreeningConditionID(Integer ncdScreeningConditionID) {
		this.ncdScreeningConditionID = ncdScreeningConditionID;
	}

	public String getScreeningCondition() {
		return screeningCondition;
	}

	public void setScreeningCondition(String screeningCondition) {
		this.screeningCondition = screeningCondition;
	}

	public Integer getNcdScreeningReasonID() {
		return ncdScreeningReasonID;
	}

	public void setNcdScreeningReasonID(Integer ncdScreeningReasonID) {
		this.ncdScreeningReasonID = ncdScreeningReasonID;
	}

	public String getReasonForScreening() {
		return reasonForScreening;
	}

	public void setReasonForScreening(String reasonForScreening) {
		this.reasonForScreening = reasonForScreening;
	}

	public Timestamp getNextScreeningDate() {
		return nextScreeningDate;
	}

	public void setNextScreeningDate(Timestamp nextScreeningDate) {
		this.nextScreeningDate = nextScreeningDate;
	}

	public String getActionForScreenPositive() {
		return actionForScreenPositive;
	}

	public void setActionForScreenPositive(String actionForScreenPositive) {
		this.actionForScreenPositive = actionForScreenPositive;
	}

	public Boolean getIsScreeningComplete() {
		return isScreeningComplete;
	}

	public void setIsScreeningComplete(Boolean isScreeningComplete) {
		this.isScreeningComplete = isScreeningComplete;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Timestamp lastModDate) {
		this.lastModDate = lastModDate;
	}

	@Override
	public String toString() {
		return "NCDScreening [ID=" + ID + ", beneficiaryRegID=" + beneficiaryRegID + ", benVisitID=" + benVisitID
				+ ", providerServiceMapID=" + providerServiceMapID + ", visitCode=" + visitCode
				+ ", ncdScreeningVisitNo=" + ncdScreeningVisitNo + ", ncdScreeningConditionID="
				+ ncdScreeningConditionID + ", screeningCondition=" + screeningCondition + ", ncdScreeningReasonID="
				+ ncdScreeningReasonID + ", reasonForScreening=" + reasonForScreening + ", nextScreeningDate="
				+ nextScreeningDate + ", actionForScreenPositive=" + actionForScreenPositive + ", isScreeningComplete="
				+ isScreeningComplete + ", deleted=" + deleted + ", processed=" + processed + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", lastModDate=" + lastModDate + "]";
	}
	
	
}