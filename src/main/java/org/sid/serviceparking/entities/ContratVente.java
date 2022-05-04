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
public class ContratVente implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContratVente;
    private Double montantVente;
    private Date dateDebutVente;
    private String dateFinVente;
    @OneToMany(mappedBy = "contratVente",fetch = FetchType.LAZY)
    private Collection<Reglement> reglements;
    @OneToMany(mappedBy = "contratVente",fetch = FetchType.LAZY)
    private Collection<ReservationVente> reservationVentes;

}
