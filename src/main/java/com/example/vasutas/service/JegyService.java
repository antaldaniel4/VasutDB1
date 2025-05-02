package com.example.vasutas.service;


import com.example.vasutas.model.Jegy;
import com.example.vasutas.model.Vonat;
import com.example.vasutas.repository.JegyRepository;
import com.example.vasutas.repository.VonatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JegyService {

    @Autowired
    private JegyRepository jegyRepo;

    @Autowired
    private VonatRepository vonatRepo;

    public List<Jegy> getOsszesJegy() {
        return jegyRepo.findAll();
    }

    public Jegy getJegyById(int id) {
        return jegyRepo.findById(id).orElse(null);
    }

    public Jegy vasarolJegyet(Jegy jegy) {
        Vonat vonat = vonatRepo.findById(jegy.getVonat().getId())
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen vonat ID: " + jegy.getVonat().getId()));




        return jegyRepo.save(jegy);
    }

    public void torolJegyet(int id) {
        jegyRepo.deleteById(id);
    }
}