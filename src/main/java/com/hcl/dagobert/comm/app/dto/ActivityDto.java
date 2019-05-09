package com.hcl.dagobert.comm.app.dto;

import java.io.Serializable;
import java.util.Date;

public class ActivityDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productActivityId;

	private Long partyId;

	public Long getProductActivityId() {
		return productActivityId;
	}

	public void setProductActivityId(Long productActivityId) {
		this.productActivityId = productActivityId;
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public Date getTransactionDt() {
		return transactionDt;
	}

	public void setTransactionDt(Date transactionDt) {
		this.transactionDt = transactionDt;
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

	public Character getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(Character transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	private Date transactionDt;

	private Long productCode;

	private Long activityCode;

	private Character transactionStatus;

}
