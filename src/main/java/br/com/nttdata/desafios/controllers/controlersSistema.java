package br.com.nttdata.desafios.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@ResquestMapping

public class controlersSistema {
    @PostMapping("/criou")
    public void criar(){
    System.out.println("Criou");
    }

}

