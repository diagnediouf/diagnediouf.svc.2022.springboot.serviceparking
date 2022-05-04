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
public class ReservationVente implements Serializable {
    @Id
    private String codeReservVente;
    private Date dateReservVente;
    @ManyToOne
    @JoinColumn(name = "IDContratV")
    private ContratVente contratVente;
    @ManyToOne
    @JoinColumn(name = "CIN_CLIENT")
    private Client client;
    @OneToMany(mappedBy = "reservationVente",fetch = FetchType.LAZY)
    private Collection<Vehicule> vehicules;
    @ManyToOne
    @JoinColumn(name = "NUM_PAIE_V")
    private PaiementVente paiementVente;

    public ReservationVente(String codeReservVente, Date dateReservVente,
                            ContratVente contratVente, Client client,
                            PaiementVente paiementVente) {
        this.codeReservVente = codeReservVente;
        this.dateReservVente = dateReservVente;
        this.contratVente = contratVente;
        this.client = client;
        this.paiementVente = paiementVente;
    }
}
