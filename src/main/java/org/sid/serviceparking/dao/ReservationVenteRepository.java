package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.ReservationVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationVenteRepository extends JpaRepository<ReservationVente,String> {
}
