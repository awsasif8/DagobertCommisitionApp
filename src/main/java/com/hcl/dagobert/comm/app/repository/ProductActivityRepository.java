package com.hcl.dagobert.comm.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.dagobert.comm.app.entity.ProductActivity;

@Repository
public interface ProductActivityRepository extends JpaRepository<ProductActivity, Long> {

}
