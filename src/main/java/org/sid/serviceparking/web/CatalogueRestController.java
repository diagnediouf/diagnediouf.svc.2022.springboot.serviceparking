package org.sid.serviceparking.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.sid.serviceparking.dao.VehiculeRepository;
import org.sid.serviceparking.entities.Vehicule;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin("*")
@RestController
public class CatalogueRestController {
    private VehiculeRepository vehiculeRepository;

    public CatalogueRestController(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
    }
    @GetMapping(path="/photoVehicule/{matricule}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhotoVeh(@PathVariable("matricule") String matricule) throws IOException{
        Vehicule v=vehiculeRepository.findById(matricule).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/parkauto/vehicule/"+v.getPhotoVeh()));
    }

    @PostMapping(path = "/uploadPhoto/{matricule}")
     public void uploadPhoto(MultipartFile file, @PathVariable String matricule) throws Exception {
        Vehicule v=vehiculeRepository.findById(matricule).get();
        v.setPhotoVeh(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/parkauto/vehicule/"+v.getPhotoVeh()),file.getBytes());
        vehiculeRepository.save(v);
     }
}
