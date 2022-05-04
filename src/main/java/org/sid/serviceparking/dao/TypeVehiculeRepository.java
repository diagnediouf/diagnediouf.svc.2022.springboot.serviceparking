package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.TypeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface TypeVehiculeRepository extends JpaRepository<TypeVehicule,Long>{
    
}