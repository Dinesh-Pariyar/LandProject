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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long landId;
    private float totalBrick;
    private double landPrice;
    private String landLocation;
    private boolean isDeleted=Boolean.FALSE;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ownLand", referencedColumnName = "ownerId")
    private Owner owner;

    @Override
    public String toString() {
        return "Land{" +
                "landId=" + landId +
                ", totalBrick=" + totalBrick +
                ", landPrice=" + landPrice +
                ", landLocation='" + landLocation + '\'' +
                ", isDeleted=" + isDeleted +
                ", owner=" + owner +
                '}';
    }
}
