package com.example.vasutas.repository;

import com.example.vasutas.model.Jegy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JegyRepository extends JpaRepository<Jegy, Integer> {

    // Példa: felhasználóhoz tartozó jegyek lekérése
    List<Jegy> findByFelhasznaloId(int felhasznaloId);

    // Példa: induló és érkező állomás alapján
    List<Jegy> findByInduloAllomas_AllomasIdAndErkezoAllomas_AllomasId(int induloId, int erkezoId);


    // Bővíthető saját query-kkel (pl. dátum, vonat szerint stb.)
}
