package com.crucial.featurama.controller;

import com.crucial.featurama.model.Experiment;
import com.crucial.featurama.model.ExperimentCreateRequest;
import com.crucial.featurama.model.ExperimentEditRequest;
import com.crucial.featurama.model.treatment.Override;
import com.crucial.featurama.service.ExperimentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/experiment")
@RequiredArgsConstructor
public class ExperimentController {

    private final ExperimentService experimentService;

    @PostMapping("/create")
    public ResponseEntity<Experiment> createExperiment(@RequestBody ExperimentCreateRequest request) {
        return ResponseEntity.ok(experimentService.createExperiment(request));
    }

    @GetMapping("/{experimentName}")
    public ResponseEntity<Experiment> getExperiment(@PathVariable String experimentName) {
        return ResponseEntity.ok(experimentService.getExperiment(experimentName));
    }

    @PutMapping("/edit/{experimentName}")
    public ResponseEntity<Experiment> editExperiment(@PathVariable String experimentName, @RequestBody ExperimentEditRequest request) {
        return ResponseEntity.ok(experimentService.getExperiment(experimentName));
    }

    @PostMapping("/overrides")
    public ResponseEntity createOverride(@RequestBody Override request) {
        experimentService.createOverride(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/overrides/{experimentName}")
    public ResponseEntity<List<Override>> getOverrides(@PathVariable String experimentName) {
        return ResponseEntity.ok(experimentService.getOverrides(experimentName));
    }

    // @PostMapping("/allocate-treatment")
    // public ResponseEntity allocateTreatment(@RequestBody )

}

