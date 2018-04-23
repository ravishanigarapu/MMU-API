package com.iemr.mmu.data.ncdcare;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.iemr.mmu.data.anc.ANCDiagnosis;

@Entity
@Table(name = "t_ncddiagnosis")
public class NCDCareDiagnosis
{
	@Id
	@GeneratedValue
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
	@Column(name = "PrescriptionID")
	private Long prescriptionID;
	
	@Expose
	@Column(name = "NCD_Condition")
	private String ncdScreeningCondition;
	
	@Expose
	@Column(name = "NCD_Complication")
	private String ncdComplication;
	
	@Expose
	@Column(name = "NCDCareType")
	private String ncdCareType;
	
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

	@Expose
	@Column(name = "VanSerialNo")
	private Long vanSerialNo;
	
	@Expose
	@Column(name = "VehicalNo")
	private String vehicalNo;
	
	@Expose
	@Column(name = "ParkingPlaceID")
	private Integer parkingPlaceID;
	
	@Expose
	@Column(name = "SyncedBy")
	private String syncedBy;
	
	@Expose
	@Column(name = "SyncedDate")
	private Timestamp syncedDate;
	
	@Expose
	@Column(name = "ReservedForChange")
	private String reservedForChange;

	public Long getID()
	{
		return ID;
	}

	public void setID(Long iD)
	{
		ID = iD;
	}

	public Long getBeneficiaryRegID()
	{
		return beneficiaryRegID;
	}

	public void setBeneficiaryRegID(Long beneficiaryRegID)
	{
		this.beneficiaryRegID = beneficiaryRegID;
	}

	public Long getBenVisitID()
	{
		return benVisitID;
	}

	public void setBenVisitID(Long benVisitID)
	{
		this.benVisitID = benVisitID;
	}

	public Integer getProviderServiceMapID()
	{
		return providerServiceMapID;
	}

	public void setProviderServiceMapID(Integer providerServiceMapID)
	{
		this.providerServiceMapID = providerServiceMapID;
	}

	
	public String getNcdCareCondition()
	{
		return ncdScreeningCondition;
	}

	public void setNcdCareCondition(String ncdCareCondition)
	{
		this.ncdScreeningCondition = ncdCareCondition;
	}

	
	public String getNcdComplication()
	{
		return ncdComplication;
	}

	public void setNcdComplication(String ncdComplication)
	{
		this.ncdComplication = ncdComplication;
	}

	public String getNcdCareType()
	{
		return ncdCareType;
	}

	public void setNcdCareType(String ncdCareType)
	{
		this.ncdCareType = ncdCareType;
	}

	public Boolean getDeleted()
	{
		return deleted;
	}

	public void setDeleted(Boolean deleted)
	{
		this.deleted = deleted;
	}

	public String getProcessed()
	{
		return processed;
	}

	public void setProcessed(String processed)
	{
		this.processed = processed;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate)
	{
		this.createdDate = createdDate;
	}

	public String getModifiedBy()
	{
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getLastModDate()
	{
		return lastModDate;
	}

	public void setLastModDate(Timestamp lastModDate)
	{
		this.lastModDate = lastModDate;
	}

	public Long getVanSerialNo()
	{
		return vanSerialNo;
	}

	public void setVanSerialNo(Long vanSerialNo)
	{
		this.vanSerialNo = vanSerialNo;
	}

	public String getVehicalNo()
	{
		return vehicalNo;
	}

	public void setVehicalNo(String vehicalNo)
	{
		this.vehicalNo = vehicalNo;
	}

	public Integer getParkingPlaceID()
	{
		return parkingPlaceID;
	}

	public void setParkingPlaceID(Integer parkingPlaceID)
	{
		this.parkingPlaceID = parkingPlaceID;
	}

	public String getSyncedBy()
	{
		return syncedBy;
	}

	public void setSyncedBy(String syncedBy)
	{
		this.syncedBy = syncedBy;
	}

	public Timestamp getSyncedDate()
	{
		return syncedDate;
	}

	public void setSyncedDate(Timestamp syncedDate)
	{
		this.syncedDate = syncedDate;
	}

	public String getReservedForChange()
	{
		return reservedForChange;
	}

	public void setReservedForChange(String reservedForChange)
	{
		this.reservedForChange = reservedForChange;
	}

	public Long getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(Long prescriptionID) {
		this.prescriptionID = prescriptionID;
	}

	public NCDCareDiagnosis(Long beneficiaryRegID, Long benVisitID, Integer providerServiceMapID,
			String ncdCareCondition, String ncdComplication, String ncdCareType) {
		super();
		this.beneficiaryRegID = beneficiaryRegID;
		this.benVisitID = benVisitID;
		this.providerServiceMapID = providerServiceMapID;
		this.ncdScreeningCondition = ncdCareCondition;
		this.ncdComplication = ncdComplication;
		this.ncdCareType = ncdCareType;
	}
	
	public static NCDCareDiagnosis getNCDCareDiagnosisDetails(ArrayList<Object[]> resList) {
		NCDCareDiagnosis cOBJ = null;
		if(null != resList && resList.size()>0){
			for (Object[] obj : resList) {
				cOBJ = new NCDCareDiagnosis((Long)obj[0], (Long)obj[1], (Integer)obj[2], (String)obj[3], (String)obj[4], (String)obj[5]);
			}
		}
		return cOBJ;
	}
	
}
