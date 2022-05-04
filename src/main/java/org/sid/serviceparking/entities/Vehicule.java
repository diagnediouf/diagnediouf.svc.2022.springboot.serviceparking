package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class Vehicule implements Serializable {
    @Id
    private String matricule;
    private String marque;
    private String carburant;
    private String kilometrage;
    private String couleur;
    private Long nbrePlace;
    private Double currentprice;
    private Double prixParJour;
    private boolean promotion;
    private boolean selected;
    private boolean disponibilite;
    private String description;
    private String photoVeh;
    @Transient
    private int quantity=1;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "TYPE_VEH_ID", nullable = false)
    private TypeVehicule typeVehicule;
    @ManyToOne
    @JoinColumn(name = "NUM_PAIE_V")
    private PaiementVente paiementVente;
    @ManyToOne
    @JoinColumn(name = "NUM_PAIE_LOC")
    private PaiementLocation paiementLocation;
    @ManyToOne
    @JoinColumn(name = "CODE_RESERLOC")
    private ReservationLocation reservationLocation;
    @ManyToOne
    @JoinColumn(name = "NUM_REGLEMENT")
    private Reglement reglement;
    @ManyToOne
    @JoinColumn(name = "CODE_R_VENTE")
    private ReservationVente reservationVente;


}
