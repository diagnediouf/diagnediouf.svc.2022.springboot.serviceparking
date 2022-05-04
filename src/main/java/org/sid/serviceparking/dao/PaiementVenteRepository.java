package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.PaiementVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementVenteRepository extends JpaRepository<PaiementVente,Long> {
}
