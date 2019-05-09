package com.hcl.dagobert.comm.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.dagobert.comm.app.entity.ActivityData;

@Repository
public interface ActivityDataRepository extends JpaRepository<ActivityData, Long> {
	
	
	@Query(value="Select distinct activity_code from activity_data where party_id=:partyid and product_code=:productCode", nativeQuery=true)
	public List<?>  findByPartyIdAndProductCode(@Param("partyid") Long partyId, @Param("productCode") Long productCode);
/*
	@Query("select distinct(e) from ActivityData e ")
	public List<ActivityData>  findByPartyIdAndProductCode(Long partyId, Long productCode);*/
}
