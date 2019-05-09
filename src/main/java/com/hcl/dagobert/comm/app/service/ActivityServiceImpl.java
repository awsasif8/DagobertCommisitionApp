package com.hcl.dagobert.comm.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dagobert.comm.app.dto.ActivityDto;
import com.hcl.dagobert.comm.app.entity.ActivityData;
import com.hcl.dagobert.comm.app.repository.ActivityDataRepository;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	ActivityDataRepository activityRepository;
	
	@Override
	public List<ActivityDto> activityCodes(Long partyId, Long productCode) {
		
		List<ActivityDto> activitydtos=new ArrayList<>();
		
		List<?> activityCodes= activityRepository.findByPartyIdAndProductCode(partyId.longValue(), productCode.longValue());

		for(Object codes:activityCodes) {
		
		         
            ActivityDto activity=new ActivityDto();
		    activity.setActivityCode(new Long(codes.toString()));
		    activitydtos.add(activity);
         }
		
		return activitydtos;
	}

}
