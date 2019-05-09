package com.hcl.dagobert.comm.app.dto;

import java.io.Serializable;

public class ProductCommisitionRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long partyId;
	
	private Long productCode;
	
	private Long activityCode;
	
	private String startDt;
	
	public ProductCommisitionRequest() {
		super();
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(Long activityCode) {
		this.activityCode = activityCode;
	}

	public String getStartDt() {
		return startDt;
	}

	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}
	
	

}
