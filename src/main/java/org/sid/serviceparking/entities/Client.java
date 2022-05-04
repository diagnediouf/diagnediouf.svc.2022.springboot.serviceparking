package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
@Entity
public class Client implements Serializable {
    @Id
    private String cniClient;
    private String nomClient;
    private String prenomClient;
    private String telClient;
    private String adresseClient;
    private String mailClient;
    private String username;
    private String permitClient;
    private Long  ageClient;
    @ManyToOne
    @JoinColumn(name = "matriculeAgent")
    private Agent agent;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<ReservationLocation> reservationLocations;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<PaiementVente>paiementVentes;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<PaiementLocation> paiementLocations;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<Reglement> reglements;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<ReservationVente> reservationVentes;
}
