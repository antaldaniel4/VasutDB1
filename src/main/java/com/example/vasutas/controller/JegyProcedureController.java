package com.example.vasutas.controller;


import com.example.vasutas.service.JegyProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jegyvetele")
public class JegyProcedureController {

    @Autowired
    private JegyProcedureService jegyService;

    @PostMapping("/vasarlas")
    public void vasarlas(@RequestParam int induloAllomasId,
                         @RequestParam int erkezoAllomasId,
                         @RequestParam int vonatId,
                         @RequestParam int felhasznaloId,
                         @RequestParam double ar) {
        jegyService.ujJegyLetrehoz(induloAllomasId, erkezoAllomasId, vonatId, felhasznaloId, ar);
    }
}
