package com.hcl.dagobert.comm.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dagobert.comm.app.dto.PartyIdsDto;
import com.hcl.dagobert.comm.app.dto.ProductCodeDto;
import com.hcl.dagobert.comm.app.entity.ActivityData;
import com.hcl.dagobert.comm.app.repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityDataRepository;

	@Override
	public List<PartyIdsDto> getPartyIdsList() {
		List<PartyIdsDto> response = new ArrayList<PartyIdsDto>();
		try {
			List<ActivityData> partyIdsList = activityDataRepository.findAll();
			if (!partyIdsList.isEmpty()) {
				partyIdsList.stream().forEach(partyEntity -> {
					PartyIdsDto activityDto = new PartyIdsDto();
					activityDto.setPartyId(partyEntity.getPartyId());

					response.add(activityDto);
				});
			}

		} catch (Exception e) {

		}
		return response;
	}

	@Override
	public List<ProductCodeDto> getPartyIdDetails(Long partyId) {
		List<ProductCodeDto> response = new ArrayList<ProductCodeDto>();
		try {
			List<ActivityData> partyCodesList = activityDataRepository.findByPartyId(partyId);
			if (!partyCodesList.isEmpty()) {
				partyCodesList.stream().forEach(partyCodeEntity -> {
					ProductCodeDto productCodeDto = new ProductCodeDto();
					productCodeDto.setActivityCode(partyCodeEntity.getActivityCode());
					productCodeDto.setProductCode(partyCodeEntity.getProductCode());
					productCodeDto.setStatus(partyCodeEntity.getTransactionStatus());
					response.add(productCodeDto);
				});
			}

		} catch (Exception e) {

		}
		return response;
	}



}
