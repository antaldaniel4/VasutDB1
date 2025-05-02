package com.example.vasutas.controller;

import com.example.vasutas.model.Felhasznalo;
import com.example.vasutas.service.FelhasznaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/felhasznalok")
public class FelhasznaloController {

    @Autowired
    private FelhasznaloService service;

    @GetMapping
    public List<Felhasznalo> osszesFelhasznalo() {
        return service.getOsszesFelhasznalo();
    }

    @GetMapping("/{id}")
    public Felhasznalo getFelhasznalo(@PathVariable Long id) {
        return service.getFelhasznaloById(id);
    }

    @GetMapping("/email/{email}")
    public Felhasznalo getFelhasznaloEmailAlapjan(@PathVariable String email) {
        return service.getFelhasznaloByEmail(email);
    }

    @PostMapping
    public Felhasznalo ujFelhasznalo(@RequestBody Felhasznalo f) {
        return service.ujFelhasznalo(f);
    }

    @PutMapping("/{id}")
    public Felhasznalo modositFelhasznalo(@PathVariable Long id, @RequestBody Felhasznalo ujAdatok) {
        return service.modositFelhasznalo(id, ujAdatok);
    }

    @DeleteMapping("/{id}")
    public void torolFelhasznalo(@PathVariable Long id) {
        service.torolFelhasznalo(id);
    }
}