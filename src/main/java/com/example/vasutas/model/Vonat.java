package com.example.vasutas.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vonat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vonat_id;


    private String tipus; // pl. személyvonat, IC, gyorsvonat



    @OneToMany(mappedBy = "vonat", cascade = CascadeType.ALL)
    private List<Jegy> jegyek;

    // később itt lehet menetrendet, vagonokat, ülőhelyeket is kezelni

    // Konstruktorok, getterek, setterek

    public Vonat() {}

    public int getId() {
        return vonat_id;
    }

    public void setId(int id) {
        this.vonat_id = id;
    }





    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public List<Jegy> getJegyek() {
        return jegyek;
    }

    public void setJegyek(List<Jegy> jegyek) {
        this.jegyek = jegyek;
    }
}