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
@Table(name = "PRODUCT_ACTIVITY")
public class ProductActivity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productActivityId;
	
	@Column(name="PRODUCT_CODE")
	private Long productCode;
	
	@Column(name="ACTIVITY_CODE")
	private Long activityCode;
	
	@Column(name="START_DT")
	private Date startDt;
	
	@Column(name = "END_DT")
	private Date endDt;
	
	@Column(name = "SUBJECT")
	private String subject;
	
	@Column(name = "AMOUNT_TO_BE_PAID")
	private Double amountToBePaid;
	
	public ProductActivity() {
		super();
	}

	public Long getProductActivityId() {
		return productActivityId;
	}

	public void setProductActivityId(Long productActivityId) {
		this.productActivityId = productActivityId;
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

	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(Double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}

	@Override
	public String toString() {
		return "ProductActivity [productActivityId=" + productActivityId + ", productCode=" + productCode
				+ ", activityCode=" + activityCode + ", startDt=" + startDt + ", endDt=" + endDt + ", subject="
				+ subject + ", amountToBePaid=" + amountToBePaid + "]";
	}
	
	
	
	
	
	
	
	
}
