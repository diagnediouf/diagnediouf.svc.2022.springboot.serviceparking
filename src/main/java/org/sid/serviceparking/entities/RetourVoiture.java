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
public class RetourVoiture implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroRetourVehi;
    private Date dateRetour;
    @ManyToOne
    @JoinColumn(name = "NUM_REGLEMENT")
    private Reglement reglement;
    @OneToMany(mappedBy = "retourVoiture",fetch = FetchType.LAZY)
    private Collection<Penalisation> penalisations;
}
