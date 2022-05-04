package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("PAIEMENTCHEQV")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaiementCheqVente extends PaiementVente{
    private String numeroCheqV;

    public PaiementCheqVente(Date datepaiementV,
                             Client client, String numeroCheqV) {
        super(datepaiementV, client);
        this.numeroCheqV = numeroCheqV;
    }
}
