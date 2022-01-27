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
    public ResponseEntity<String> put(@PathVariable int id){
        return new ResponseEntity<>("REQUISAO PUT pelo ID !",HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<String> patch(){
        return new ResponseEntity<>("REQUIÇÃO PATCH!!!", HttpStatus.OK) ;
    }

    @DeleteMapping
    public ResponseEntity<String> delete(){
        return new ResponseEntity<>("REQUISAO DELETE!!!",HttpStatus.OK) ;
    }
}
//localhost:8080/produto/
//    Create - Criar - POST - cria um obejeto - criei
//    Read - LER - Get - Ler - ok
//    Update - Atualizar - Put/Patch - atualiza um objeto - aceitei
//    Delete - Deletar - Delete - exclui - nada