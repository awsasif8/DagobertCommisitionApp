package com.hcl.dagobert.comm.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dagobert.comm.app.dto.PartyIdsDto;
import com.hcl.dagobert.comm.app.dto.ProductCodeDto;
import com.hcl.dagobert.comm.app.service.ActivityService;

@RestController
public class ActivityController {
	@Autowired
	ActivityService activityService;

	@GetMapping("/getPartyIds")
	public List<PartyIdsDto> getPartyCodes() {

		List<PartyIdsDto> response = activityService.getPartyIdsList();
		return response;
	}
	
	@GetMapping("/getProductDetais")
	public List<ProductCodeDto> getProductCodes(Long partyId) {

		List<ProductCodeDto> response = activityService.getPartyIdDetails(partyId);
		return response;
	}
}
