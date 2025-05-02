package com.example.vasutas.service;

import com.example.vasutas.model.Felhasznalo;
import com.example.vasutas.repository.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FelhasznaloService {

    @Autowired
    private FelhasznaloRepository repo;

    public List<Felhasznalo> getOsszesFelhasznalo() {
        return repo.findAll();
    }

    public Felhasznalo getFelhasznaloById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Felhasznalo getFelhasznaloByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }

    public Felhasznalo ujFelhasznalo(Felhasznalo f) {
        if (repo.existsByEmail(f.getEmail())) {
            throw new IllegalArgumentException("Ez az e-mail cím már regisztrálva van: " + f.getEmail());
        }
        return repo.save(f);
    }

    public Felhasznalo modositFelhasznalo(Long id, Felhasznalo ujAdatok) {
        Felhasznalo aktualis = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen felhasználó: " + id));

        aktualis.setNev(ujAdatok.getNev());
        aktualis.setEmail(ujAdatok.getEmail());
        aktualis.setJelszo(ujAdatok.getJelszo());

        return repo.save(aktualis);
    }

    public void torolFelhasznalo(Long id) {
        repo.deleteById(id);
    }
}