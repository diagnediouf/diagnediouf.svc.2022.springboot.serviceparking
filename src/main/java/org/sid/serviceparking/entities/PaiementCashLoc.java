package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("PAIECACHLOC")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaiementCashLoc extends PaiementLocation {
    private Double montantLoc;

    public PaiementCashLoc(Date datepaiementLoc, Client client, Double montantLoc) {
        super(datepaiementLoc, client);
        this.montantLoc = montantLoc;
    }
}
