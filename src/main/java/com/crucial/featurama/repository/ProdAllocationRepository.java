package com.crucial.featurama.repository;

import com.crucial.featurama.model.ProdAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdAllocationRepository extends JpaRepository<ProdAllocation, String> {
}
