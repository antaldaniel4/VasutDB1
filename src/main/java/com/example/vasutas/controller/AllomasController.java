package com.example.vasutas.controller;


import com.example.vasutas.model.Allomas;
import com.example.vasutas.service.AllomasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allomasok")
public class AllomasController {

    @Autowired
    private AllomasService allomasService;

    @GetMapping
    public List<Allomas> osszesAllomas() {
        return allomasService.getOsszesAllomas();
    }

    @GetMapping("/{id}")
    public Allomas getAllomas(@PathVariable Long id) {
        return allomasService.getAllomasById(id);
    }

    @GetMapping("/varos/{varosNev}")
    public List<Allomas> allomasokVarosban(@PathVariable String varosNev) {
        return allomasService.keresAllomasVarosAlapjan(varosNev);
    }

    @GetMapping("/keres")
    public List<Allomas> allomasokNevSzerint(@RequestParam String nev) {
        return allomasService.keresAllomasNevReszletre(nev);
    }

    @PostMapping
    public Allomas ujAllomas(@RequestBody Allomas allomas) {
        return allomasService.ujAllomas(allomas);
    }

    @PutMapping("/{id}")
    public Allomas modositAllomas(@PathVariable Long id, @RequestBody Allomas allomas) {
        return allomasService.modositAllomas(id, allomas);
    }

    @DeleteMapping("/{id}")
    public void torolAllomas(@PathVariable Long id) {
        allomasService.torolAllomas(id);
    }
}

/**
 *GET /api/allomasok	Összes állomás
 * GET /api/allomasok/{id}	Egy adott állomás
 * GET /api/allomasok/varos/{varosNev}	Állomások város alapján
 * GET /api/allomasok/keres?nev=...	Névrészlet alapján keresés
 * POST /api/allomasok	Új állomás hozzáadása
 * PUT /api/allomasok/{id}	Állomás adatainak módosítása
 * DELETE /api/allomasok/{id}	Törlés
 * */