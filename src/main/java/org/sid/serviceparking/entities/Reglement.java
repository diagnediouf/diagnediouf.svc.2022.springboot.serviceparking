package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Reglement implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numReglement;
    private Date dateReglement;
    private String typeReglement;
    private Double montantReglement;
    @ManyToOne
    @JoinColumn(name = "ID_CONTRAT_LOC")
    private ContratLocation contratLocation;
    @ManyToOne
    @JoinColumn(name = "ID_CONTRAT_V")
    private ContratVente contratVente;
    @ManyToOne
    @JoinColumn(name = "CNI_CLIENT")
    private Client client;
    @OneToMany(mappedBy = "reglement",fetch = FetchType.LAZY)
    private Collection<RetourVoiture> retourVoitures;
    @OneToMany(mappedBy = "reglement",fetch = FetchType.LAZY)
    private Collection<Vehicule> vehicules;
}
