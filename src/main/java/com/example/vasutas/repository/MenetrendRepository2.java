package com.example.vasutas.repository;

import com.example.vasutas.dto.MenetrendViewDto;
import com.example.vasutas.model.Menetrend;
import com.example.vasutas.model.Menetrend2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenetrendRepository2 extends JpaRepository<Menetrend2, Long> {

    @Query("""
    SELECT new com.example.vasutas.dto.MenetrendViewDto(
        j.tipus,
        a1.nev,
        a1.varos,
        m.indulasiIdo,
        a2.nev,
        a2.varos,
        m.erkezesiIdo
    )
    FROM Menetrend2 m
    JOIN m.induloAllomas a1
    JOIN m.erkezoAllomas a2
    JOIN m.vonat j
    ORDER BY j.tipus, m.indulasiIdo
""")
    List<MenetrendViewDto> findMenetrendView();
}