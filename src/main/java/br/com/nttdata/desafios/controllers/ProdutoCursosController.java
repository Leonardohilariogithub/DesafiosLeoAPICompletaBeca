package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entity.ProdutoCursos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoCursosController {

    @GetMapping(path = "/qualquer")
    public ProdutoCursos obterProduto(){
        return new ProdutoCursos(01,"JAVA", 100);
    }

}
