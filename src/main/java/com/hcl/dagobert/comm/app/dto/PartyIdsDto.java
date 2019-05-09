package com.hcl.dagobert.comm.app.dto;

import java.io.Serializable;

public class PartyIdsDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long partyId;
	public Long getPartyId() {
		return partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

}
