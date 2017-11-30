package com.iemr.mmu.repo.masterrepo.doctor;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.iemr.mmu.data.institution.Institute;

public interface InstituteRepo extends CrudRepository<Institute, Long> {
	@Query("SELECT institutionID, institutionName FROM Institute WHERE providerServiceMapID = :psmID AND deleted != 1 ")
	public ArrayList<Object[]> getInstituteDetails(@Param("psmID") Integer psmID);

}