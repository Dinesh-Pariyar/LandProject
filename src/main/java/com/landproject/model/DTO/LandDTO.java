package com.landproject.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LandDTO {
    private long landId;

    private float landArea;

    private double landPrice;

    private String landLocation;

    @ManyToOne
    private OwnerDTO owner;

}
