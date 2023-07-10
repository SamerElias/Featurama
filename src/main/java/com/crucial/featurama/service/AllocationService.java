package com.crucial.featurama.service;

import com.crucial.featurama.model.AllocationRequest;
import com.crucial.featurama.model.DevAllocation;
import com.crucial.featurama.model.ProdAllocation;
import com.crucial.featurama.repository.DevAllocationRepository;
import com.crucial.featurama.repository.ProdAllocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AllocationService {

    private final DevAllocationRepository devAllocationRepository;
    private final ProdAllocationRepository prodAllocationRepository;

    public void createAllocation(final AllocationRequest request) {
        if(request.isProd()) {
            createProdAllocation(request);
        } else {
            createDevAllocation(request);
        }
    }

    private void createDevAllocation(final AllocationRequest request) {
        DevAllocation allocation = DevAllocation.builder()
                .treatmentWeight(request.getTreatmentWeight())
                .isRunning(false)
                .exposureWeight(request.getExposureWeight())
                .build();
        devAllocationRepository.save(allocation);
    }

    private void createProdAllocation(final AllocationRequest request) {
        ProdAllocation allocation = ProdAllocation.builder()
                .treatmentWeight(request.getTreatmentWeight())
                .isRunning(false)
                .exposureWeight(request.getExposureWeight())
                .build();
        prodAllocationRepository.save(allocation);
    }

}
