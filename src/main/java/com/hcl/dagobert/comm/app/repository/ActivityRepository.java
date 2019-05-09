package com.hcl.dagobert.comm.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.dagobert.comm.app.entity.ActivityData;

public interface ActivityRepository extends JpaRepository<ActivityData, Long> {
	
	public List<ActivityData> findByPartyId(Long partyId);

}
