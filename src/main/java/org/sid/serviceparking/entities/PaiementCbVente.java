package org.sid.serviceparking.entities;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("PAIEMENTCBV")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaiementCbVente extends PaiementVente{
    private String numeroCbVente;
    private String dateValiditeCbVente;

    public PaiementCbVente(Date datepaiementV, Client client, String numeroCbVente, String dateValiditeCbVente) {
        super(datepaiementV, client);
        this.numeroCbVente = numeroCbVente;
        this.dateValiditeCbVente = dateValiditeCbVente;
    }
}
