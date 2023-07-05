package com.crucial.featurama.model;

import com.crucial.featurama.model.treatment.DevAllocation;
import com.crucial.featurama.model.treatment.ProdAllocation;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "experiment")
public class Experiment {

    @Id
    private String experimentName;
    private String description;
    private String owningTeam;
    private String owningUser;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "experimentName")
    private List<ProdAllocation> prodProdAllocations;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "experimentName")
    private List<DevAllocation> devAllocations;

}
