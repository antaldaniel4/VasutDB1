package com.example.vasutas.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;

@Service
public class JegyProcedureService {

    @PersistenceContext
    private EntityManager entityManager;

    public void ujJegyLetrehoz(int induloAllomasId, int erkezoAllomasId, int vonatId,
                               int felhasznaloId, double ar) {

        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("uj_jegy_letrehoz");

        query.registerStoredProcedureParameter("p_indulo_allomas_id", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("p_erkezo_allomas_id", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("p_vonat_id", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("p_felhasznalo_id", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("p_ar", Double.class, ParameterMode.IN);

        query.setParameter("p_indulo_allomas_id", induloAllomasId);
        query.setParameter("p_erkezo_allomas_id", erkezoAllomasId);
        query.setParameter("p_vonat_id", vonatId);
        query.setParameter("p_felhasznalo_id", felhasznaloId);
        query.setParameter("p_ar", ar);

        query.execute();
    }
}