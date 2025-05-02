package com.example.vasutas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "menetrend")
public class Menetrend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // nem kötelező, de egyértelmű
    private Long id;

    @Column(name = "indulasi_ido", nullable = false)
    private LocalDateTime indulasiIdo;

    @Column(name = "erkezesi_ido", nullable = false)
    private LocalDateTime erkezesiIdo;

    @ManyToOne
    @JoinColumn(name = "induloAllomas_id", nullable = false)
    private Allomas induloAllomas;

    @ManyToOne
    @JoinColumn(name = "erkezoAllomas_id", nullable = false)
    private Allomas erkezoAllomas;

    @ManyToOne
    @JoinColumn(name = "vonat_id", nullable = false)
    private Vonat vonat;

    // ----- Getterek és setterek -----

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(LocalDateTime indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }

    public LocalDateTime getErkezesiIdo() {
        return erkezesiIdo;
    }

    public void setErkezesiIdo(LocalDateTime erkezesiIdo) {
        this.erkezesiIdo = erkezesiIdo;
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
}
