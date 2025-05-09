package com.example.vasutas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/allomasok")
    public String allomasok() {
        return "allomasok.html";
    }

    @GetMapping("/jegyek")
    public String jegyek() {
        return "jegyek.html";
    }

    @GetMapping("/menetrend")
    public String menetrend() {
        return "menetrend.html";
    }

    @GetMapping("/menetrend2")
    public String menetrend2() {
        return "menetrend2.html";
    }

    @GetMapping("/varosok")
    public String varosok() {
        return "varosok.html";
    }

    @GetMapping("/vonatok")
    public String vonatok() {
        return "vonatok.html";
    }

    @GetMapping("/felhasznalok")
    public String felhasznalo() {
        return "felhasznalok.html";
    }
}