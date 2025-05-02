package com.example.vasutas.repository;

import com.example.vasutas.model.Allomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllomasRepository extends JpaRepository<Allomas, Long> {

  //  List<Allomas> findByVarosNev(String varos);
    List<Allomas> findByVaros(String varos);

    List<Allomas> findByNevContainingIgnoreCase(String keresettSzoveg);
}
