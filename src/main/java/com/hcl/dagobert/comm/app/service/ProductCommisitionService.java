package com.hcl.dagobert.comm.app.service;

import com.hcl.dagobert.comm.app.dto.ProductCommisitionRequest;
import com.hcl.dagobert.comm.app.dto.ProductCommisitionResponse;

public interface ProductCommisitionService {
	
	public ProductCommisitionResponse calculateProductComission(ProductCommisitionRequest request);

}
