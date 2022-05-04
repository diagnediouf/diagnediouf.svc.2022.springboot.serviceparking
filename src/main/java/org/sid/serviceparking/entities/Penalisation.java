package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Penalisation implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroPenalisation;
    private Double cout;
    private String raison;
    @ManyToOne
    @JoinColumn(name = "Num_RetourV")
    private RetourVoiture retourVoiture;
}
