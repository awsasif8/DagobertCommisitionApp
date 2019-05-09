package com.hcl.dagobert.comm.app.service;

import java.util.List;

import com.hcl.dagobert.comm.app.dto.ActivityDto;

public interface ActivityService {
	
	public List<ActivityDto> activityCodes(Long partyId, Long productCode);
	

}
