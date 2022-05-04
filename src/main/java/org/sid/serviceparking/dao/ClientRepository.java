package org.sid.serviceparking.dao;

import java.util.List;

import org.sid.serviceparking.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,String> {
    @RestResource(path = "/byCniClient")
    public List<Client> findByCniClientContains(@Param("mc") String cni);
    @RestResource(path = "/byCniClientPage")
    public Page<Client> findByCniClientContains(@Param("mc") String cni, Pageable pageable);

}
