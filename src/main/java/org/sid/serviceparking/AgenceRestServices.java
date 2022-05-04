package org.sid.serviceparking;

import org.sid.serviceparking.dao.AgenceRepository;
import org.sid.serviceparking.entities.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgenceRestServices {
    @Autowired
    private AgenceRepository agenceRepository;
    @GetMapping(value = "/listAgences")
    public List<Agence> listAgences(){ return agenceRepository.findAll(); }

    @GetMapping(value = "/listAgences/{idAgence}")
    public Agence listAgences(@PathVariable(name = "idAgence") Long idAgence)
    { return agenceRepository.findById(idAgence).get(); }

    @PutMapping(value = "/listAgences/{idAgence}")
    public Agence update(@PathVariable(name = "idAgence") Long idAgence, @RequestBody Agence a)
    {
        a.setIdAgence(idAgence);
        return agenceRepository.save(a);
    }
    @PostMapping(value = "/listAgences")
    public Agence save(@RequestBody Agence a) { return agenceRepository.save(a); }
    @DeleteMapping(value ="/listAgences/{idAgence}")
    public void delete(@PathVariable(name= "idAgence") Long idAgence){ agenceRepository.deleteById(idAgence);
    }
}
