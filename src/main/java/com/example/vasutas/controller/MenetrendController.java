package com.example.vasutas.controller;


import com.example.vasutas.model.Menetrend;
import com.example.vasutas.service.MenetrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menetrendek")
public class MenetrendController {

    @Autowired
    private MenetrendService menetrendService;

    // Összes menetrend lekérdezése
    @GetMapping
    public List<Menetrend> getAllMenetrendek() {
        return menetrendService.getAllMenetrendek();
    }

    // Egy menetrend lekérdezése ID alapján
    @GetMapping("/{id}")
    public ResponseEntity<Menetrend> getMenetrendById(@PathVariable int id) {
        Menetrend menetrend = menetrendService.getMenetrendById(id);
        return ResponseEntity.ok(menetrend);
    }

    // Menetrend létrehozása
    @PostMapping
    public ResponseEntity<Menetrend> createMenetrend(@RequestBody Menetrend menetrend) {
        Menetrend created = menetrendService.saveMenetrend(menetrend);
        return ResponseEntity.ok(created);
    }

    // Menetrend törlése
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenetrend(@PathVariable int id) {
        menetrendService.deleteMenetrend(id);
        return ResponseEntity.noContent().build();
    }

    // Menetrend frissítése (opcionális)
    @PutMapping("/{id}")
    public ResponseEntity<Menetrend> updateMenetrend(@PathVariable int id, @RequestBody Menetrend updated) {
        Menetrend result = menetrendService.updateMenetrend(id, updated);
        return ResponseEntity.ok(result);
    }
}