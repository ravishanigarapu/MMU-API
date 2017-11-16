package com.iemr.mmu.controller.nurse.master.anc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iemr.mmu.controller.doctor.main.cancerScreening.DoctorController;
import com.iemr.mmu.service.masterservice.ANCMasterDataServiceImpl;
import com.iemr.utils.mapper.InputMapper;
import com.iemr.utils.response.OutputResponse;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping({ "/anc" })
/** Objective: Performs fetching master data for nurse anc */
public class NurseANCMasterController {
	private InputMapper inputMapper = new InputMapper();
	private OutputResponse response;
	private Logger logger = LoggerFactory.getLogger(NurseANCMasterController.class);
	
	private ANCMasterDataServiceImpl ancMasterDataServiceImpl;
	
	@Autowired
	public void setAncMasterDataServiceImpl(ANCMasterDataServiceImpl ancMasterDataServiceImpl) {
		this.ancMasterDataServiceImpl = ancMasterDataServiceImpl;
	}
	
	@CrossOrigin()
	@ApiOperation(value = "provides master Data for Nurse ANC Screen", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/ancNurseMasterData" }, method = { RequestMethod.GET })
	public String getMasterDataForANC() {

		OutputResponse response = new OutputResponse();
		logger.info("getMasterDataForANC..");
		try {
			response.setResponse(ancMasterDataServiceImpl.getANCMasterDataForNurse());
			logger.info("getMasterDataForANC response:" + response);
		} catch (Exception e) {
			response.setError(e);
			logger.error("Error in getMasterDataForANC:" + e);
		}
		return response.toString();
	}
	
}
