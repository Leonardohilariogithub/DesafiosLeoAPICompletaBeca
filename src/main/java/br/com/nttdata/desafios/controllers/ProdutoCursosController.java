package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entity.ProdutoCursos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoCursosController {

    @GetMapping(path = "/qualquer")
    public ProdutoCursos obterProduto(){
        return new ProdutoCursos(01,"JAVA", 100);
    }

}
