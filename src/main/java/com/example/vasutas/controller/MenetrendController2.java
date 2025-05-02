package com.example.vasutas.controller;

import com.example.vasutas.dto.MenetrendViewDto;
import com.example.vasutas.model.Menetrend2;
import com.example.vasutas.service.MenetrendService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menetrend2")
public class MenetrendController2 {

    @Autowired
    private MenetrendService2 menetrendService;

    @GetMapping
    public List<Menetrend2> getAll() {
        return menetrendService.findAll();
    }

    @GetMapping("/view")
    public List<MenetrendViewDto> getMenetrendView() {
        return menetrendService.getMenetrendView();
    }

    @PostMapping
    public Menetrend2 save(@RequestBody Menetrend2 menetrend) {
        return menetrendService.save(menetrend);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        menetrendService.delete(id);
    }
}
