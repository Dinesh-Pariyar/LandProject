package com.landproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invId;
    @OneToOne
    @JoinColumn(name = "userInvId",referencedColumnName = "userId")
    private User user;

}
