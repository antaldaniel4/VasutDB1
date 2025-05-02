package com.example.vasutas.controller;

import com.example.vasutas.model.Vonat;
import com.example.vasutas.service.VonatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vonatok")
public class VonatController {

    @Autowired
    private VonatService vonatService;

    @GetMapping
    public List<Vonat> osszesVonat() {
        return vonatService.getOsszesVonat();
    }

    @GetMapping("/{id}")
    public Vonat getVonat(@PathVariable int id) {
        return vonatService.getVonatById(id);
    }

    @GetMapping("/tipus/{tipus}")
    public List<Vonat> vonatokTipusSzerint(@PathVariable String tipus) {
        return vonatService.getVonatokTipusAlapjan(tipus);
    }
/*
    @GetMapping("/potjegyes")
    public List<Vonat> potjegyesVonatok() {
        return vonatService.getPotjegyesVonatok();
    }
*/
    @PostMapping
    public Vonat ujVonat(@RequestBody Vonat vonat) {
        return vonatService.ujVonat(vonat);
    }

    @PutMapping("/{id}")
    public Vonat modositVonat(@PathVariable int id, @RequestBody Vonat vonat) {
        return vonatService.modositVonat(id, vonat);
    }

    @DeleteMapping("/{id}")
    public void torolVonat(@PathVariable int id) {
        vonatService.torolVonat(id);
    }
}

/*
*GET /api/vonatok: összes vonat listázása

GET /api/vonatok/{id}: vonat lekérdezése ID szerint

GET /api/vonatok/tipus/{tipus}: pl. IC, személyvonat

GET /api/vonatok/potjegyes: csak pótjegyköteles vonatok

POST /api/vonatok: új vonat rögzítése

PUT /api/vonatok/{id}: meglévő vonat módosítása

DELETE /api/vonatok/{id}: törlés
* */