package com.example.vasutas.model;


import jakarta.persistence.*;
@Entity
@Table(name = "allomas")
public class Allomas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "allomas_seq")
    @SequenceGenerator(name = "allomas_seq", sequenceName = "ALLOMAS_SEQ", allocationSize = 1)
    @Column(name = "ALLOMAS_ID")
    private int allomasId;

    @Column(name = "nev", nullable = false)
    private String nev;

    @Column(name = "varos", nullable = false)
    private String varos;

    @Column(name = "irsz", nullable = true)
    private String irsz;
    //todo Irsz -> int


    public Allomas() {
    }

    public Allomas(int allomasId, String nev, String varos, String irsz) {
        this.allomasId = allomasId;
        this.nev = nev;
        this.varos = varos;
        this.irsz = irsz;

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

    public String getIrsz() {
        return irsz;
    }

    public void setIrsz(String irsz) {
        this.irsz = irsz;
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