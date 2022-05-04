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
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class ContratLocation implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContratLoc;
    private Date dateDebutLoc;
    private String dateFinLoc;
    private Double montantLoc;
    @OneToMany(mappedBy = "contratLocation",fetch = FetchType.LAZY)
    private Collection<ReservationLocation> reservationLocations;
    @OneToMany(mappedBy = "contratLocation",fetch = FetchType.LAZY)
    private Collection<Reglement> reglements;

}
