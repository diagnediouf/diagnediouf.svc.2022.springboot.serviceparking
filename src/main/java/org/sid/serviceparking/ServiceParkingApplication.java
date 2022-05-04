package org.sid.serviceparking;

import org.sid.serviceparking.dao.*;
import org.sid.serviceparking.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class ServiceParkingApplication implements CommandLineRunner {
    @Autowired
    private AgenceRepository agenceRepository;
    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private DepartementRepository departementRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ContratLocationRepository contratLocationRepository;
    @Autowired
    private ContratVenteRepository contratVenteRepository;
    @Autowired
    private PaiementVenteRepository paiementVenteRepository;
    @Autowired
    private PaiementLocationRepository paiementLocationRepository;
    @Autowired
    private ReservationLocationRepository reservationLocationRepository;
    @Autowired
    private ReservationVenteRepository reservationVenteRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ServiceParkingApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Agence.class, Agent.class, Client.class, Vehicule.class, TypeVehicule.class);

       /*Agence agc1=agenceRepository.save(new Agence("Senegal","Dakar","EMG","0001","Castor"));
       Agence agc2=agenceRepository.save(new Agence("Senegal","Dakar","EMG","0000","Pikine"));
       Agence agc3=agenceRepository.save(new Agence("Senegal","Dakar","EMG","776665533","Nord foire"));
       Agence agc4=agenceRepository.save(new Agence("Senegal","Dakar","EMG","774347777","Guediawaye"));
       Agence agc5=agenceRepository.save(new Agence("Senegal","Dakar","EMG","776665555","Medina"));
        Departement dept1= departementRepository.save(new Departement("Acceuil"));
        Departement dept2= departementRepository.save(new Departement("Comptable"));
        Departement dept3= departementRepository.save(new Departement("Secretaire"));
        Agent agt1= agentRepository.save
                (new Agent
                        ("M1","Dione","Mbaye","776544344",
                "USERADMIN@gmail.com","userAD",
                                "123",agc1,dept3));
        Agent agt2= agentRepository.save
                (new Agent
                        ("M2","Fall","Tons","775400850",
                                "ADMIN@gmail.com","tons",
                                "123",agc1,dept1));
        Agent agt3= agentRepository.save
                (new Agent
                        ("M04","Sock","Badou","774355566",
                                "ADMIN@gmail.com","bsock",
                                "123",agc1,dept2));
        Client cli=clientRepository.save (new Client("1913200300186","Diouf",
                "Pape","774865578",
                "MBAO","momardiouf28d@gmail.com",
                "123456","28-04-1992",agt));
        Client cli2=clientRepository.save(new Client("1001254455","CISSE",
                "Mamour","776502248",
                "Podor","cisse@gmail.com",
                "246810","02-06-1980",agt));
        ContratLocation ctrloc=contratLocationRepository.save
                (new ContratLocation(new Date(),"16-05-2021",300000.00));
        ContratVente crtv=contratVenteRepository.save
                    (new ContratVente(2500000.00,new Date(),"16-05-2021/8heure"));

        PaiementVente pv1=paiementVenteRepository.save(new PaiementCashVente(new Date(),cli,2500000.00));
        PaiementVente pv2=paiementVenteRepository.save(new PaiementCashVente(new Date(),cli2,8500000.00));
        PaiementVente pv3=paiementVenteRepository.save(new PaiementCbVente(new Date(),cli,"158736","28-12-2022"));
        PaiementVente pv4=paiementVenteRepository.save(new PaiementCbVente(new Date(),cli2,"254689","28-12-2024"));
        PaiementVente pv5=paiementVenteRepository.save(new PaiementCheqVente(new Date(),cli,"00000086"));

        PaiementLocation pl1=paiementLocationRepository.save
                (new PaiementCarteBanqLoc(new Date(),cli2,"0000123","22-12-2024"));
        PaiementLocation pl2=paiementLocationRepository.save
                (new PaiementCashLoc(new Date(),cli,5000000.90));
        PaiementLocation pl3=paiementLocationRepository.save
                (new PaimentChequeLoc(new Date(),cli2,"000000001"));

        ReservationVente rsv1=reservationVenteRepository.save
                (new ReservationVente("RESEV(1)",new Date(),crtv,cli2,pv1));
        ReservationVente rsv2=reservationVenteRepository.save
                (new ReservationVente("RESEV(2)",new Date(),crtv,cli2,pv3));
        ReservationVente rsv3=reservationVenteRepository.save
                (new ReservationVente("RESEV(3)",new Date(),crtv,cli2,pv5));

        ReservationLocation rsl1=reservationLocationRepository.save
                (new ReservationCD("RESERV(1Loc)",new Date(),cli,ctrloc,pl3,3000.00));
        ReservationLocation rsl2=reservationLocationRepository.save
                (new ReservationLD("RESERV(2Loc)",new Date(),cli2,ctrloc,pl2,10000.00));

        Vehicule vh=vehiculeRepository.save(new Vehicule("DK-4520-AC","TOYOTA",
                                "Gagoil","15000km/an","Rouge",5,1500,));*/
    }
}
