package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entity.ProdutoCursos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoControler {

    List<ProdutoCursos> bancoDeDados = new ArrayList<>();

    @GetMapping(path = "/qualquer")
    public ResponseEntity<List<ProdutoCursos>> obterProduto(){
        return ResponseEntity.ok(bancoDeDados);
    }

    @PostMapping
    public ResponseEntity<String> criar(@RequestBody ProdutoCursos body){
        bancoDeDados.add(body);
        return new ResponseEntity<>("criou!!!", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public String put(@PathVariable int id){
        return "REQUISAO PUT pelo ID !";
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
//localhost:8080/produto/
//    Create - Criar - POST - cria um obejeto - criei
//    Read - LER - Get - Ler - ok
//    Update - Atualizar - Put/Patch - atualiza um objeto - aceitei
//    Delete - Deletar - Delete - exclui - nada