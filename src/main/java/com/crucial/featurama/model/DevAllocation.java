package com.crucial.featurama.model;

import jakarta.persistence.*;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dev_allocation")
public class DevAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID allocationId;
    private String targetGroup;
    private Boolean isRunning;
    private Short exposureWeight;
    private Short treatmentWeight;

}

