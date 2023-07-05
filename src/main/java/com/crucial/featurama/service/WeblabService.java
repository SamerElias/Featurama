package com.crucial.featurama.service;

import com.crucial.featurama.model.Weblab;
import com.crucial.featurama.model.WeblabCreateRequest;
import com.crucial.featurama.model.WeblabEditRequest;
import com.crucial.featurama.model.treatment.Override;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WeblabService {

    public Weblab createWeblab(final WeblabCreateRequest request) {
        return Weblab.builder().build();
    }

    public Weblab getWeblab(final String name) {
        /*
         * return weblabRepository.findById(weblabId)
         *       .orElseThrow(() -> new ResourceNotFoundException("Weblab not found"));
         * */
        return Weblab.builder().build();
    }

    public Weblab editWeblab(final WeblabEditRequest request) {
        return Weblab.builder().build();
    }

    public void createOverride(final Override request) {
    }

    public List<Override> getOverrides(final String name) {
        return new ArrayList<>();
    }

}
