package com.example.vasutas.model;


import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name = "utas")
public class Felhasznalo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "felhasznalo_id")
    private int id;

    @Column(name = "nev", nullable = false)
    private String nev;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "jelszo", nullable = false)
    private String jelszo;

    @Column(name = "telefonszam")
    private String telefon;

    @Column(name = "szuletesi_datum")
    private LocalDate szuletesiDatum;

    public Felhasznalo() {}

    public Felhasznalo(int id, String nev, String email, String jelszo, String telefon, LocalDate szuletesiDatum) {
        this.id = id;
        this.nev = nev;
        this.email = email;
        this.jelszo = jelszo;
        this.telefon = telefon;
        this.szuletesiDatum = szuletesiDatum;
    }

    // Getterek és setterek

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJelszo() {
        return jelszo;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public LocalDate getSzuletesiDatum() {
        return szuletesiDatum;
    }

    public void setSzuletesiDatum(LocalDate szuletesiDatum) {
        this.szuletesiDatum = szuletesiDatum;
    }

    @Override
    public String toString() {
        return "Felhasznalo{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", email='" + email + '\'' +
                ", jelszo='" + jelszo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", szuletesiDatum=" + szuletesiDatum +
                '}';
    }
}