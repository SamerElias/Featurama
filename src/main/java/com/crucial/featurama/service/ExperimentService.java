package com.crucial.featurama.service;

import com.crucial.featurama.model.Experiment;
import com.crucial.featurama.model.ExperimentCreateRequest;
import com.crucial.featurama.model.ExperimentEditRequest;
import com.crucial.featurama.model.treatment.Override;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExperimentService {

    public Experiment createExperiment(final ExperimentCreateRequest request) {
        return Experiment.builder().build();
    }

    public Experiment getExperiment(final String name) {
        /*
         * return experimentRepository.findById(experimentId)
         *       .orElseThrow(() -> new ResourceNotFoundException("Experiment not found"));
         * */
        return Experiment.builder().build();
    }

    public Experiment editExperiment(final ExperimentEditRequest request) {
        return Experiment.builder().build();
    }

    public void createOverride(final Override request) {
    }

    public List<Override> getOverrides(final String name) {
        return new ArrayList<>();
    }

}
