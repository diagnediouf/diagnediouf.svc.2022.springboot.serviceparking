package org.sid.serviceparking.dao;

import java.util.List;

import org.sid.serviceparking.entities.Vehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface VehiculeRepository extends JpaRepository<Vehicule,String> {
    @RestResource(path = "/selectedVehicule")
    public List<Vehicule> findBySelectedIsTrue();
    @RestResource(path = "/vehiculeByKeyword")
    public List<Vehicule> findByMarqueContains(@Param("mc") String marq);
    @RestResource(path = "/byVehiculePage")
    public Page<Vehicule> findByMarqueContains(@Param("mc") String marq, Pageable pageable);
    @RestResource(path = "/promoVehicule")
    public List<Vehicule> findByPromotionIsTrue();
    @RestResource(path = "/dispoVehicule")
    public List<Vehicule> findByDisponibiliteIsTrue();

}
