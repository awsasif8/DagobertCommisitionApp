package com.hcl.dagobert.comm.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dagobert.comm.app.dto.ActivityDto;
import com.hcl.dagobert.comm.app.service.ActivityServiceImpl;

@RestController
public class ActivityController {
	
	
	
	
	@Autowired
	ActivityServiceImpl serviceImpl;
	
	
	
	
	@GetMapping("/getActivityList")
	public List<ActivityDto>  getActivityList(@RequestParam Long partyId, @RequestParam Long productCode) {
		
		  
		List<ActivityDto> activity=serviceImpl.activityCodes(partyId, productCode);
		
		return activity;
		
		
		
		
		
		
	}
	
	
	
	

}
