package com.crucial.featurama.model.treatment;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "override")
public class Override {

    @Id
    private UUID overrideId;
    private String customerId;
    @Enumerated(EnumType.STRING)
    private Treatment treatment;
    private String experimentName;

}
