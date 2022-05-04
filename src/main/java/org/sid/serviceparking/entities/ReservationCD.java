package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("RCD")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ReservationCD extends ReservationLocation{
    private Double prixParJour;

    public ReservationCD(String codeReservLoc, Date dateReservLocation,
                         Client client, ContratLocation contratLocation,
                         PaiementLocation paiementLocation, Double prixParJour) {
        super(codeReservLoc, dateReservLocation, client, contratLocation, paiementLocation);
        this.prixParJour = prixParJour;
    }
}
