package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("PAIECBLOC")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaiementCarteBanqLoc extends PaiementLocation {
    private String numerocarteLoc;
    private String dateValidite;

    public PaiementCarteBanqLoc(Date datepaiementLoc,
                                Client client, String numerocarteLoc, String dateValidite) {
        super(datepaiementLoc, client);
        this.numerocarteLoc = numerocarteLoc;
        this.dateValidite = dateValidite;
    }
}
