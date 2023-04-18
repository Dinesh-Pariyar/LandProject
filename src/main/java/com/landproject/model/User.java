package com.landproject.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Where(clause = "is_deleted=false")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @NotNull
    private String userName;
    @NotNull
    @Column(unique = true)
    private String userEmail;
    @NotNull
    private String userPassword;
    private boolean isDeleted=Boolean.FALSE;
}
