package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entity.ProdutoCursos;
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

    @PostMapping
    public ProdutoCursos criarCursos(@RequestBody ProdutoCursos produto){
        bancoDeDados.add(produto);
        return produto;
    }
    @PutMapping
    public ProdutoCursos criarCursos(@RequestBody ProdutoCursos produto){
        bancoDeDados.add(produto);
        return produto;
    }
    @PatchMapping
    public ProdutoCursos criarCursos(@RequestBody ProdutoCursos produto){
        bancoDeDados.add(produto);
        return produto;
    }
    @DeleteMapping
    public ProdutoCursos criarCursos(@RequestBody ProdutoCursos produto){
        bancoDeDados.add(produto);
        return produto;
    }

}
