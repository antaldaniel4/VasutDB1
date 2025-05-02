package com.example.vasutas.service;


import com.example.vasutas.model.Vonat;
import com.example.vasutas.repository.VonatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VonatService {

    @Autowired
    private VonatRepository vonatRepo;

    public List<Vonat> getOsszesVonat() {
        return vonatRepo.findAll();
    }

    public Vonat getVonatById(int id) {
        return vonatRepo.findById(id).orElse(null);
    }

    public List<Vonat> getVonatokTipusAlapjan(String tipus) {
        return vonatRepo.findByTipus(tipus);
    }

  /*  public List<Vonat> getPotjegyesVonatok() {
        return vonatRepo.findByPotjegyKotelezoTrue();
    }
*/
    public Vonat ujVonat(Vonat vonat) {
        return vonatRepo.save(vonat);
    }

    public Vonat modositVonat(int id, Vonat ujAdatok) {
        Vonat aktualis = vonatRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen vonat ID: " + id));


        aktualis.setTipus(ujAdatok.getTipus());
        //aktualis.setPotjegyKotelezo(ujAdatok.isPotjegyKotelezo());

        return vonatRepo.save(aktualis);
    }

    public void torolVonat(int id) {
        vonatRepo.deleteById(id);
    }
}
