package com.example.vasutas.repository;


import com.example.vasutas.model.Vonat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VonatRepository extends JpaRepository<Vonat, Integer> {

    List<Vonat> findByTipus(String tipus);

    //List<Vonat> findByPotjegyKotelezoTrue(); // csak IC / gyorsvonatok, ahol kötelező a pótjegy
}