package com.landproject.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerDTO {
    private long ownerId;
    @OneToOne
    private UserDTO user;
    @OneToMany
    private List<LandDTO> landList;

}
