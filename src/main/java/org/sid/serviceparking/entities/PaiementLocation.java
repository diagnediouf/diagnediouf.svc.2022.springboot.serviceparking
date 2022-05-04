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
@DiscriminatorColumn(name = "TYPE_PAIE_LOC",
discriminatorType = DiscriminatorType.STRING,length = 20)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public abstract class PaiementLocation implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeropaiementLoc;
    private Date datepaiementLoc;
    @ManyToOne
    @JoinColumn(name = "CNI_CLIENT")
    private Client client;
    @OneToMany(mappedBy = "paiementLocation",fetch = FetchType.LAZY)
    private Collection<ReservationLocation> reservationLocations;
    @OneToMany(mappedBy = "paiementLocation",fetch = FetchType.LAZY)
    private Collection<Vehicule> vehicules;

    public PaiementLocation(Date datepaiementLoc, Client client) {
        this.datepaiementLoc = datepaiementLoc;
        this.client = client;
    }
}
