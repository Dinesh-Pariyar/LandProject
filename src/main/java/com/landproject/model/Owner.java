package com.landproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ownerId;
    @OneToOne
    @JoinColumn(name = "OwnUsrId",referencedColumnName = "userId")
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Land> landList;

    @Override
    public String toString() {
        return "Owner{" +
                "ownerId=" + ownerId +
                ", user=" + user +
                ", landList=" + landList +
                '}';
    }
}
