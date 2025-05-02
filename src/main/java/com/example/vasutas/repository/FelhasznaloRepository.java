package com.example.vasutas.repository;

import com.example.vasutas.model.Felhasznalo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FelhasznaloRepository extends JpaRepository<Felhasznalo, Long> {

    Optional<Felhasznalo> findByEmail(String email);
    boolean existsByEmail(String email);
}
