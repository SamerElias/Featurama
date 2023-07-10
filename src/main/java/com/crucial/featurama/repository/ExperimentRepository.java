package com.crucial.featurama.repository;

import com.crucial.featurama.model.Experiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperimentRepository extends JpaRepository<Experiment, String> {

    Optional<Experiment> findByExperimentName(String experimentName);

}
