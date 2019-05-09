package com.hcl.dagobert.comm.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ACTIVITY_DATA")
public class ActivityData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productActivityId;
	
	@Column(name="PARTY_ID")
	private Long partyId;
	
	@Column(name="TRANSACTION_DATE")
	private Date transactionDt;
	
	@Column(name="PRODUCT_CODE")
	private Long productCode;
	
	@Column(name="ACTIVITY_CODE")
	private Long activityCode;
	
	@Column(name="TRANSACTION_STATUS")
	private Character transactionStatus;
	
	public ActivityData() {
		super();
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

	@Override
	public String toString() {
		return "Product [partyId=" + partyId + ", transactionDt=" + transactionDt + ", productCode=" + productCode
				+ ", activityCode=" + activityCode + ", transactionStatus=" + transactionStatus + "]";
	}

	
	
	

}
