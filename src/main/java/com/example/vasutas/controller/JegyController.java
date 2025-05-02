package com.example.vasutas.controller;

import com.example.vasutas.model.Jegy;
import com.example.vasutas.service.JegyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jegyek")
public class JegyController {

    @Autowired
    private JegyService jegyService;

    @GetMapping
    public List<Jegy> listAll() {
        return jegyService.getOsszesJegy();
    }

    @GetMapping("/{id}")
    public Jegy getById(@PathVariable int id) {
        return jegyService.getJegyById(id);
    }

    @PostMapping
    public Jegy ujJegy(@RequestBody Jegy jegy) {
        return jegyService.vasarolJegyet(jegy);
    }

    @DeleteMapping("/{id}")
    public void torolJegy(@PathVariable int id) {
        jegyService.torolJegyet(id);
    }
}

/*
* ✅ Funkciók:

    Jegyek listázása (GET /api/jegyek)

    Egy jegy lekérése ID alapján (GET /api/jegyek/{id})

    Jegyvásárlás (POST /api/jegyek)

    Jegytörlés (DELETE /api/jegyek/{id})
* */