package com.hcl.dagobert.comm.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TRANSACTION")
public class ProductTransaction implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productTransId;
	
	@Column
	private Long partyId;
	
	@Column
	private Long productCode;
	
	@Column
	private Long activityCode;
	
	@Column
	private Long noOfTransactions;
	
	@Column
	private Double commisition;
	
	@Column
	private Double totalAmount;
	
	public ProductTransaction() {
		super();
	}

	public Long getProductTransId() {
		return productTransId;
	}

	public void setProductTransId(Long productTransId) {
		this.productTransId = productTransId;
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

	
	public Long getNoOfTransactions() {
		return noOfTransactions;
	}

	public void setNoOfTransactions(Long noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}

	
	@Override
	public String toString() {
		return "ProductTransaction [productTransId=" + productTransId + ", productCode=" + productCode
				+ ", activityCode=" + activityCode + ", noOfTransactions="
				+ noOfTransactions + "]";
	}
	
	
	

}
