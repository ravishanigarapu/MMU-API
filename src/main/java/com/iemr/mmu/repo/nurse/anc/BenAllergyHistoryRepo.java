package com.iemr.mmu.repo.nurse.anc;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.mmu.data.anc.BenAllergyHistory;

@Repository
public interface BenAllergyHistoryRepo extends CrudRepository<BenAllergyHistory, Long> {

	@Query("select Date(createdDate), allergyStatus, allergyType, allergyName, allergicReactionType, otherAllergicReaction, remarks "
			+ " from BenAllergyHistory a where a.beneficiaryRegID = :beneficiaryRegID AND allergyStatus is not null and deleted = false "
			+ "order by createdDate DESC")
	public ArrayList<Object[]> getBenPersonalAllergyDetail(@Param("beneficiaryRegID") Long beneficiaryRegID);

	@Query(" SELECT beneficiaryRegID, benVisitID, providerServiceMapID, allergyStatus, allergyType, allergyName, allergicReactionTypeID, "
			+ "allergicReactionType, otherAllergicReaction, remarks, visitCode  FROM BenAllergyHistory "
			+ " WHERE beneficiaryRegID = :benRegID AND deleted = false AND visitCode = :visitCode")
	public ArrayList<Object[]> getBenPersonalAllergyDetail(@Param("benRegID") Long benRegID,
			 @Param("visitCode") Long visitCode);

	@Modifying
	@Transactional
	@Query("Update BenAllergyHistory set deleted=true, processed=:processed WHERE ID = :ID")
	public int deleteExistingBenAllergyHistory(@Param("ID") Long ID, @Param("processed") String processed);
	
	@Query("SELECT ID, processed from BenAllergyHistory where beneficiaryRegID=:benRegID AND benVisitID = :benVisitID AND deleted=false")
	public ArrayList<Object[]> getBenAllergyHistoryStatus(@Param("benRegID") Long benRegID,
			@Param("benVisitID") Long benVisitID);
}
