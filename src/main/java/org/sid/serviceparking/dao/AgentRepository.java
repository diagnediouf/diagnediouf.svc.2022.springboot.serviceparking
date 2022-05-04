package org.sid.serviceparking.dao;

import org.sid.serviceparking.entities.Agent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource
public interface AgentRepository extends JpaRepository<Agent,String> {
    @RestResource(path = "/byMatriculeAgent")
    public List<Agent> findByMatriculeAgentContains(@Param("mc") String mat);
    @RestResource(path = "/byMatriculeAgentPage")
    public Page<Agent> findByMatriculeAgentContains(@Param("mc") String mat, Pageable pageable);
}