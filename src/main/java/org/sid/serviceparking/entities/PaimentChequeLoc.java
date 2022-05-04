package org.sid.serviceparking.entities;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("PAIECHEQLOC")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaimentChequeLoc extends PaiementLocation {
    private String numeroCheqLoc;

    public PaimentChequeLoc(Date datepaiementLoc,
                            Client client, String numeroCheqLoc) {
        super(datepaiementLoc, client);
        this.numeroCheqLoc = numeroCheqLoc;
    }
}
