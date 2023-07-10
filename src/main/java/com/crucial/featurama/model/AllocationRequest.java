package com.crucial.featurama.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class AllocationRequest {

    private String experimentName;
    private boolean isProd;
    private Short exposureWeight;
    private Short treatmentWeight;

}
