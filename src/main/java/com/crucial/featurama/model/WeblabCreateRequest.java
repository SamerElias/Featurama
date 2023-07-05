package com.crucial.featurama.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeblabCreateRequest {

    private String weblabName;
    private String description;
    private List<String> impactedAreas;
    private String owningTeam;
    private String owningUser;

}
