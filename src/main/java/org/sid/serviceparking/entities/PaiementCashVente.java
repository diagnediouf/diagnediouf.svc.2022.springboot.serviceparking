package org.sid.serviceparking.entities;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("PAIEMENTCASHV")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaiementCashVente extends PaiementVente{
    private Double montantVente;

    public PaiementCashVente(Date datepaiementV, Client client, Double montantVente) {
        super(datepaiementV, client);
        this.montantVente = montantVente;
    }
}
