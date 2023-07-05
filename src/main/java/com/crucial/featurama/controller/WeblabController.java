package com.crucial.featurama.controller;

import com.crucial.featurama.model.Weblab;
import com.crucial.featurama.model.WeblabCreateRequest;
import com.crucial.featurama.model.WeblabEditRequest;
import com.crucial.featurama.model.treatment.Override;
import com.crucial.featurama.service.WeblabService;
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
@RequestMapping("/api/v1/weblab")
@RequiredArgsConstructor
public class WeblabController {

    private final WeblabService weblabService;

    @PostMapping("/create")
    public ResponseEntity<Weblab> createWeblab(@RequestBody WeblabCreateRequest request) {
        return ResponseEntity.ok(weblabService.createWeblab(request));
    }

    @GetMapping("/{weblabName}")
    public ResponseEntity<Weblab> getWeblab(@PathVariable String weblabName) {
        return ResponseEntity.ok(weblabService.getWeblab(weblabName));
    }

    @PutMapping("/edit/{weblabName}")
    public ResponseEntity<Weblab> editWeblab(@PathVariable String weblabName, @RequestBody WeblabEditRequest request) {
        return ResponseEntity.ok(weblabService.getWeblab(weblabName));
    }

    @PostMapping("/overrides")
    public ResponseEntity createOverride(@RequestBody Override request) {
        weblabService.createOverride(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/overrides/{weblabName}")
    public ResponseEntity<List<Override>> getOverrides(@PathVariable String weblabName) {
        return ResponseEntity.ok(weblabService.getOverrides(weblabName));
    }

    // @PostMapping("/allocate-treatment")
    // public ResponseEntity allocateTreatment(@RequestBody )

}

