package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.ReservationLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationLocationRepository extends JpaRepository<ReservationLocation,String> {
}
