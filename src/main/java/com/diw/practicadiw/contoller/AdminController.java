package com.diw.practicadiw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde AdminController";
    }
}
