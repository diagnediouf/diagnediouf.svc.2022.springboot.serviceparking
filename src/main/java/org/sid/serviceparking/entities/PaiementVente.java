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
@DiscriminatorColumn(name = "TYPE_PVente",
discriminatorType = DiscriminatorType.STRING,length = 20)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public abstract class PaiementVente implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeropaiementV;
    private Date datepaiementV;
    @ManyToOne
    @JoinColumn(name = "CIN_CLIENT")
    private Client client;
    @OneToMany(mappedBy = "paiementVente",fetch = FetchType.LAZY)
    private Collection<ReservationVente>reservationVentes;
    @OneToMany(mappedBy = "paiementVente",fetch = FetchType.LAZY)
    private Collection<Vehicule>vehicules;

    public PaiementVente(Date datepaiementV, Client client) {
        this.datepaiementV = datepaiementV;
        this.client = client;
    }
}
