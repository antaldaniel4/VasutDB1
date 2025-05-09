package com.example.vasutas.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Jegy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime ervenyesTol;
    private LocalDateTime ervenyesIg;

    private int ar; // jegy ára forintban

    @ManyToOne
    @JoinColumn(name = "indulo_allomas_id")
    private Allomas induloAllomas;

    @ManyToOne
    @JoinColumn(name = "erkezo_allomas_id")
    private Allomas erkezoAllomas;

    @ManyToOne
    @JoinColumn(name = "vonat_id")
    @JsonBackReference
    private Vonat vonat;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "felhasznalo_id")
    private Felhasznalo felhasznalo;

    //private boolean potjegySzukseges; // ha IC vagy gyorsvonat, stb.

    // Konstruktor, getterek és setterek

    public Jegy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getErvenyesTol() {
        return ervenyesTol;
    }

    public void setErvenyesTol(LocalDateTime ervenyesTol) {
        this.ervenyesTol = ervenyesTol;
    }

    public LocalDateTime getErvenyesIg() {
        return ervenyesIg;
    }

    public void setErvenyesIg(LocalDateTime ervenyesIg) {
        this.ervenyesIg = ervenyesIg;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public Allomas getInduloAllomas() {
        return induloAllomas;
    }

    public void setInduloAllomas(Allomas induloAllomas) {
        this.induloAllomas = induloAllomas;
    }

    public Allomas getErkezoAllomas() {
        return erkezoAllomas;
    }

    public void setErkezoAllomas(Allomas erkezoAllomas) {
        this.erkezoAllomas = erkezoAllomas;
    }

    public Vonat getVonat() {
        return vonat;
    }

    public void setVonat(Vonat vonat) {
        this.vonat = vonat;
    }

    public Felhasznalo getFelhasznalo() {
        return felhasznalo;
    }

    public void setFelhasznalo(Felhasznalo felhasznalo) {
        this.felhasznalo = felhasznalo;
    }

}