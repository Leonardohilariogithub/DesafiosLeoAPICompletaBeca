package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entity.ProdutoCursos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoCursosController {

    List<ProdutoCursos> bancoDeDados = new ArrayList<>();

    @GetMapping(path = "/qualquer")
    public List<ProdutoCursos> obterProduto(){
        return bancoDeDados;
    }

    @PostMapping(path = "/criou")
    public String criar(){
        return "criou!!!";
    }

    @PutMapping
    public String put(){
        return "REQUISAO PUT!!!";
    }

    @PatchMapping
    public String patch(){
        return "REQUIÇÃO PATCH!!!";
    }

    @DeleteMapping
    public String delete(){
        return "REQUISAO DELETE!!!";
    }
}


