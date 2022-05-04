package org.sid.serviceparking.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Agence implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String pays;
    private String ville;
    private String nomAgence;
    private String telAgence;
    private String adresseAgence;
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    private Collection<Agent> agents;

    public Agence(String pays, String ville, String nomAgence, String telAgence, String adresseAgence) {
        this.pays = pays;
        this.ville = ville;
        this.nomAgence = nomAgence;
        this.telAgence = telAgence;
        this.adresseAgence = adresseAgence;
    }
}
