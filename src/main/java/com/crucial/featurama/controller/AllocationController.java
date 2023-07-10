package com.crucial.featurama.controller;

import com.crucial.featurama.model.AllocationRequest;
import com.crucial.featurama.service.AllocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/allocation")
@RequiredArgsConstructor
public class AllocationController {

    private final AllocationService allocationService;

    @PostMapping("/create")
    public void createAllocation(@RequestBody AllocationRequest request) {
        allocationService.createAllocation(request);

    }

}
