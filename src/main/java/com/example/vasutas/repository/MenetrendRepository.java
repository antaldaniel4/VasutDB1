package com.example.vasutas.repository;


import com.example.vasutas.model.Menetrend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MenetrendRepository extends JpaRepository<Menetrend, Integer> {

    // Összes menetrend adott vonatra
    List<Menetrend> findByVonatId(int vonatId);

    // Induló állomás alapján
    List<Menetrend> findByInduloAllomas_AllomasId(int indulo_allomas_id);

    // Érkező állomás alapján
    List<Menetrend> findByErkezoAllomas_AllomasId(int erkezo_allomas_id);

    // Indulási idő után (pl. jövőbeni menetrendek)
    List<Menetrend> findByIndulasiIdoAfter(LocalDateTime ido);

    // Adott útvonalra menetrend (induló + érkező állomás)
    List<Menetrend> findByInduloAllomas_AllomasIdAndErkezoAllomas_AllomasId(int induloId, int erkezoId);
}