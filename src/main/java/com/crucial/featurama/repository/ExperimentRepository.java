package com.crucial.featurama.repository;

import com.crucial.featurama.model.Experiment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExperimentRepository extends JpaRepository<Experiment, String> {

    Optional<Experiment> findByExperimentName(String experimentName);

}
