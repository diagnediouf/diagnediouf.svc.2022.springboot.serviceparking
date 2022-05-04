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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_RESERV",
        discriminatorType = DiscriminatorType.STRING,length = 3)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public abstract class ReservationLocation implements Serializable {
    @Id
    private String codeReservLoc;
    private Date dateReservLocation;
    @ManyToOne
    @JoinColumn(name = "CIN_CLI")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "CONTRAT_LOC")
    private ContratLocation contratLocation;
    @OneToMany(mappedBy = "reservationLocation",fetch = FetchType.LAZY)
    private Collection<Vehicule> vehicules;
    @ManyToOne
    @JoinColumn(name = "NUM_PAIEMENT")
    private PaiementLocation paiementLocation;

    public ReservationLocation(String codeReservLoc, Date dateReservLocation,
                               Client client, ContratLocation contratLocation,
                               PaiementLocation paiementLocation) {
        this.codeReservLoc = codeReservLoc;
        this.dateReservLocation = dateReservLocation;
        this.client = client;
        this.contratLocation = contratLocation;
        this.paiementLocation = paiementLocation;
    }
}
