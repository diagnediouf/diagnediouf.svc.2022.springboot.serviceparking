package org.sid.serviceparking;

import org.sid.serviceparking.entities.Agence;
import org.sid.serviceparking.entities.Agent;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1",types= {Agent.class})
public interface AgtProjection {
    public String getnomAgent();
    public Agence getAgence();
}
