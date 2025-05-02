package com.example.vasutas.dto;



import java.time.LocalDateTime;

public class MenetrendViewDto {

    private String vonatszam;
    private String induloAllomas;
    private String induloVaros;
    private LocalDateTime indulasiIdo;
    private String erkezoAllomas;
    private String erkezoVaros;
    private LocalDateTime erkezesiIdo;

    public MenetrendViewDto(String vonatszam, String induloAllomas, String induloVaros,
                            LocalDateTime indulasiIdo, String erkezoAllomas,
                            String erkezoVaros, LocalDateTime erkezesiIdo) {
        this.vonatszam = vonatszam;
        this.induloAllomas = induloAllomas;
        this.induloVaros = induloVaros;
        this.indulasiIdo = indulasiIdo;
        this.erkezoAllomas = erkezoAllomas;
        this.erkezoVaros = erkezoVaros;
        this.erkezesiIdo = erkezesiIdo;
    }


    public String getVonatszam() {
        return vonatszam;
    }

    public void setVonatszam(String vonatszam) {
        this.vonatszam = vonatszam;
    }

    public String getInduloAllomas() {
        return induloAllomas;
    }

    public void setInduloAllomas(String induloAllomas) {
        this.induloAllomas = induloAllomas;
    }

    public String getInduloVaros() {
        return induloVaros;
    }

    public void setInduloVaros(String induloVaros) {
        this.induloVaros = induloVaros;
    }

    public LocalDateTime getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(LocalDateTime indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }

    public String getErkezoAllomas() {
        return erkezoAllomas;
    }

    public void setErkezoAllomas(String erkezoAllomas) {
        this.erkezoAllomas = erkezoAllomas;
    }

    public String getErkezoVaros() {
        return erkezoVaros;
    }

    public void setErkezoVaros(String erkezoVaros) {
        this.erkezoVaros = erkezoVaros;
    }

    public LocalDateTime getErkezesiIdo() {
        return erkezesiIdo;
    }

    public void setErkezesiIdo(LocalDateTime erkezesiIdo) {
        this.erkezesiIdo = erkezesiIdo;
    }

}
