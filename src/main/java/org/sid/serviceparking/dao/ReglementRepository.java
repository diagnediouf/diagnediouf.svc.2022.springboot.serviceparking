package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReglementRepository extends JpaRepository<Reglement,Long> {
}
