package com.hcl.dagobert.comm.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.dagobert.comm.app.dto.PartyIdsDto;
import com.hcl.dagobert.comm.app.entity.ActivityData;

public interface ActivityRepository extends JpaRepository<ActivityData, Long> {
	
	public List<ActivityData> findByPartyId(Long partyId);
	
	@Query("select distinct f.partyId from ActivityData f")
	public List<Long> findDistinctByPartyId();
	

}
