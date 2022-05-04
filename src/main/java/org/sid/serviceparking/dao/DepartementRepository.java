package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Long> {

}
