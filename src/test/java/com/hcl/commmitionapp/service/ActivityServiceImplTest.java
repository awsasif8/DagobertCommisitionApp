package com.hcl.commmitionapp.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.dagobert.comm.app.dto.PartyIdsDto;
import com.hcl.dagobert.comm.app.entity.ActivityData;
import com.hcl.dagobert.comm.app.repository.ActivityRepository;
import com.hcl.dagobert.comm.app.service.ActivityServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ActivityServiceImplTest {
	
	@InjectMocks
	ActivityServiceImpl activityServiceImpl;
	@Mock
	ActivityRepository activityRepository;
	
	
	@Test
	public void testPartIdsLists() {
		
		List<ActivityData> activityDataLists=new ArrayList<ActivityData>();		
		ActivityData activityData=new ActivityData();		
		activityData.setActivityCode(100L);
		activityData.setPartyId(3000L);
		activityData.setProductCode(200L);
		activityDataLists.add(activityData);
		
		List<PartyIdsDto> partyIdDtoLists=new ArrayList<PartyIdsDto>();		
		PartyIdsDto partyIdsDto=new PartyIdsDto();		
		partyIdsDto.setPartyId(100L);
		partyIdDtoLists.add(partyIdsDto);
		
		Mockito.when(activityRepository.findAll()).thenReturn(activityDataLists);
		
		List<PartyIdsDto> response=activityServiceImpl.getPartyIdsList();
		
		
	   assertEquals(activityDataLists.size(), response.size());
	
		
	
	}
	

}
