package org.sid.serviceparking.dao;

import java.util.List;

import org.sid.serviceparking.entities.Agence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface AgenceRepository extends JpaRepository<Agence,Long> {
    @RestResource(path = "/byAdresseAgence")
    public List<Agence> findByAdresseAgenceContains(@Param("mc") String adr);
    @RestResource(path = "/byAdresseAgencePage")
    public Page<Agence> findByAdresseAgenceContains(@Param("mc") String adr, Pageable pageable);
}
