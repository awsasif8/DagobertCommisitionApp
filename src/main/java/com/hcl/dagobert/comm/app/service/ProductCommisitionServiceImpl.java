package com.hcl.dagobert.comm.app.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dagobert.comm.app.dto.ProductCommisitionRequest;
import com.hcl.dagobert.comm.app.dto.ProductCommisitionResponse;
import com.hcl.dagobert.comm.app.repository.ProductTransactionRepository;

@Service
public class ProductCommisitionServiceImpl implements ProductCommisitionService {
	
	private static final Logger logger=LogManager.getLogger(ProductCommisitionServiceImpl.class);
	
	@Autowired
	private ProductTransactionRepository productTransactionRepository;

	@Override
	public ProductCommisitionResponse calculateProductComission(ProductCommisitionRequest request) {
		
		ProductCommisitionResponse response=null;
		
		try {
			response=new ProductCommisitionResponse();
			
			
			
			
		} catch (Exception e) {
			logger.error("calculateProductComission : "+e.getMessage());
		}
		
		return response;
	}

}
