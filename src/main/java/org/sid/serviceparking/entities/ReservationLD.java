package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("RLD")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ReservationLD extends ReservationLocation{
    private Double prixParJour;

    public ReservationLD(String codeReservLoc, Date dateReservLocation,
                         Client client, ContratLocation contratLocation,
                         PaiementLocation paiementLocation, Double prixParJour) {
        super(codeReservLoc, dateReservLocation, client, contratLocation, paiementLocation);
        this.prixParJour = prixParJour;
    }
}
