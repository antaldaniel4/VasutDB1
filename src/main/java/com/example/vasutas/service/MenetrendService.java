package com.example.vasutas.service;

import com.example.vasutas.model.Menetrend;
import com.example.vasutas.model.Vonat;
import com.example.vasutas.repository.MenetrendRepository;
import com.example.vasutas.repository.VonatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MenetrendService {

    @Autowired
    private MenetrendRepository menetrendRepo;

    @Autowired
    private VonatRepository vonatRepo;

    public List<Menetrend> getOsszesMenetrend() {
        return menetrendRepo.findAll();
    }

    public Menetrend getMenetrendById(int id) {
        return menetrendRepo.findById(id).orElse(null);
    }

    public Menetrend ujMenetrend(Menetrend menetrend) {
        int vonatId = menetrend.getVonat().getId();
        Vonat vonat = vonatRepo.findById(vonatId)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen vonat: " + vonatId));

        menetrend.setVonat(vonat);
        return menetrendRepo.save(menetrend);
    }

    public Menetrend modositMenetrend(int id, Menetrend ujAdatok) {
        Menetrend aktualis = menetrendRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen menetrend ID: " + id));

        aktualis.setVonat(ujAdatok.getVonat());
        aktualis.setInduloAllomas(ujAdatok.getInduloAllomas());
        aktualis.setErkezoAllomas(ujAdatok.getErkezoAllomas());
        aktualis.setIndulasiIdo(ujAdatok.getIndulasiIdo());
        aktualis.setErkezesiIdo(ujAdatok.getErkezesiIdo());

        return menetrendRepo.save(aktualis);
    }

    public void torolMenetrend(int id) {
        menetrendRepo.deleteById(id);
    }

    public List<Menetrend> getMenetrendByVonatId(int vonatId) {
        return menetrendRepo.findByVonatId(vonatId);
    }

    public List<Menetrend> getMenetrendByInduloAllomas(int allomasId) {
        return menetrendRepo.findByInduloAllomas_AllomasId(allomasId);
    }

    public List<Menetrend> getMenetrendByErkezoAllomas(int allomasId) {
        return menetrendRepo.findByErkezoAllomas_AllomasId(allomasId);
    }

    public List<Menetrend> getJovobeniIndulasok(LocalDateTime datumtol) {
        return menetrendRepo.findByIndulasiIdoAfter(datumtol);
    }

    public List<Menetrend> getUtvonalMenetrend(int induloId, int erkezoId) {
        return menetrendRepo.findByInduloAllomas_AllomasIdAndErkezoAllomas_AllomasId(induloId, erkezoId);
    }

    public List<Menetrend> getAllMenetrendek() {
        return getOsszesMenetrend();
    }

    public Menetrend saveMenetrend(Menetrend menetrend) {
        return ujMenetrend(menetrend);
    }

    public Menetrend updateMenetrend(int id, Menetrend ujAdatok) {
        return modositMenetrend(id, ujAdatok);
    }

    public void deleteMenetrend(int id) {
        torolMenetrend(id);
    }


}