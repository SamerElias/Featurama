package com.crucial.featurama.model.treatment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private UUID allocationId;
    private String targetGroup;
    private Boolean isRunning;
    private Short exposureWeight;
    private Short treatmentWeight;

}

