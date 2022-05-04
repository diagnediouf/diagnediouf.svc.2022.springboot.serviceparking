package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class Departement implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDept;
    private String nomDept;
    @OneToMany(mappedBy = "departement",fetch = FetchType.LAZY)
    private Collection<Agent> agents;

    public Departement(String nomDept) {
        this.nomDept = nomDept;
    }
}
