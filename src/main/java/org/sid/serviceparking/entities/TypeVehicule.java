package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class TypeVehicule implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelleTypeVeh;
    @JsonManagedReference
    @OneToMany(mappedBy = "typeVehicule",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Collection<Vehicule> vehicules;
}
