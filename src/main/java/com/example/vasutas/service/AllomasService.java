package com.example.vasutas.service;

import com.example.vasutas.model.Allomas;
import com.example.vasutas.repository.AllomasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllomasService {

    @Autowired
    private AllomasRepository allomasRepo;

    public List<Allomas> getOsszesAllomas() {
        return allomasRepo.findAll();
    }

    public Allomas getAllomasById(Long id) {
        return allomasRepo.findById(id).orElse(null);
    }

    public List<Allomas> keresAllomasVarosAlapjan(String varosNev) {
        return allomasRepo.findByVaros(varosNev);
    }

    public List<Allomas> keresAllomasNevReszletre(String reszlet) {
        return allomasRepo.findByNevContainingIgnoreCase(reszlet);
    }

    public Allomas ujAllomas(Allomas allomas) {
        return allomasRepo.save(allomas);
    }

    public Allomas modositAllomas(Long id, Allomas ujAdatok) {
        Allomas aktualis = allomasRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen állomás ID: " + id));

        aktualis.setNev(ujAdatok.getNev());
        aktualis.setVaros(ujAdatok.getVaros());

        return allomasRepo.save(aktualis);
    }

    public void torolAllomas(Long id) {
        allomasRepo.deleteById(id);
    }
}
