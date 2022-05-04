package org.sid.serviceparking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Agent implements Serializable {
    @Id
    private String matriculeAgent;
    private String nomAgent;
    private String prenomAgent;
    private String telAgent;
    private String mailAgent;
    private String loginAgent;
    private String pwdAgent;
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name = "id_dept")
    private Departement departement;
    @OneToMany(mappedBy = "agent",fetch = FetchType.LAZY)
    private Collection<Client> clients;
    public Agent(String matriculeAgent, String nomAgent, String prenomAgent, String telAgent, String mailAgent,
            String loginAgent, String pwdAgent, Agence agence, Departement departement) {
        this.matriculeAgent = matriculeAgent;
        this.nomAgent = nomAgent;
        this.prenomAgent = prenomAgent;
        this.telAgent = telAgent;
        this.mailAgent = mailAgent;
        this.loginAgent = loginAgent;
        this.pwdAgent = pwdAgent;
        this.agence = agence;
        this.departement = departement;
    }

    

}
