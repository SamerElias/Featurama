package com.crucial.featurama.service;

import com.crucial.featurama.exception.ExperimentNotFoundException;
import com.crucial.featurama.model.Experiment;
import com.crucial.featurama.model.ExperimentCreateRequest;
import com.crucial.featurama.model.ExperimentEditRequest;
import com.crucial.featurama.model.treatment.Override;
import java.util.ArrayList;
import java.util.List;

import com.crucial.featurama.repository.ExperimentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExperimentService {

    private final ExperimentRepository repository;

    public void createExperiment(final ExperimentCreateRequest request) {
        if (request.getExperimentName() == null
                || request.getDescription() == null
                || request.getOwningTeam() == null
                || request.getOwningUser() == null) {
            throw new IllegalArgumentException("All fields must be provided");
        }
        Experiment experiment = Experiment.builder()
                .experimentName(request.getExperimentName())
                .description(request.getDescription())
                .owningTeam(request.getOwningTeam())
                .owningUser(request.getOwningUser())
                .build();
        repository.save(experiment);
    }

    public Experiment getExperiment(final String experimentName) {
        return repository.findById(experimentName)
                .orElseThrow(() -> new ExperimentNotFoundException(String.format("Experiment %s not found", experimentName)));
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
