package com.example.vasutas.model;


import jakarta.persistence.*;
@Entity
@Table(name = "allomas")
public class Allomas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allomas_id")
    private int allomasId;

    @Column(name = "nev", nullable = false)
    private String nev;

    @Column(name = "varos", nullable = false)
    private String varos;


    public Allomas() {
    }

    public Allomas(int allomasId, String nev, String varos) {
        this.allomasId = allomasId;
        this.nev = nev;
        this.varos = varos;

    }

    public int getAllomasId() {
        return allomasId;
    }

    public void setAllomasId(int allomasId) {
        this.allomasId = allomasId;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }


    @Override
    public String toString() {
        return "Allomas{" +
                "allomasId=" + allomasId +
                ", nev='" + nev + '\'' +
                ", varos='" + varos +
                '}';
    }
}