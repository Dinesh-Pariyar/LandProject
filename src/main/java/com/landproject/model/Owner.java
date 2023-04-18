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
    @OneToMany
    private List<Land> landList;
}
