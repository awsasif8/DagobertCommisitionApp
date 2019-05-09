package com.hcl.dagobert.comm.app.service;

import java.util.List;

import com.hcl.dagobert.comm.app.dto.PartyIdsDto;
import com.hcl.dagobert.comm.app.dto.ProductCodeDto;

public interface ActivityService {
	
	public List<Long> getPartyIdsList();
	
	public List<ProductCodeDto> getPartyIdDetails(Long partyId);
	

}
