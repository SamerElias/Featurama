package com.crucial.featurama.repository;

import com.crucial.featurama.model.DevAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevAllocationRepository extends JpaRepository<DevAllocation, String> {
}
