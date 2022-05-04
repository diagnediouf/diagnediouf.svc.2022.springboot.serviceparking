package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.PaiementLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementLocationRepository extends JpaRepository<PaiementLocation,Long> {
}
