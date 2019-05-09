package com.hcl.dagobert.comm.app.dto;

import java.io.Serializable;

public class ProductCodeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long productCode;

	private Long activityCode;

	private Character status;

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

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}
	
	
	
}
