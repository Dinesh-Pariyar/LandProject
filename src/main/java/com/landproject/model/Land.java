package com.landproject.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Where(clause = "is_deleted=false")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long landId;
    private float landArea;
    private double landPrice;
    private String landLocation;
    private boolean isDeleted=Boolean.FALSE;
    @ManyToOne
    @JoinColumn(name = "ownLand", referencedColumnName = "ownerId")
    private Owner owner;
}
