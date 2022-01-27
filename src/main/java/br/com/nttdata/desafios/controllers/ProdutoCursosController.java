package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entitys.ProdutoCursos;
import br.com.nttdata.desafios.services.ProdutoCursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoCursosController {

    @Autowired
    private ProdutoCursosService produtoCursosService;

    @PostMapping
    public ResponseEntity<ProdutoCursos>criar(@RequestBody ProdutoCursos produtoCursos){
        ProdutoCursos cursos = produtoCursosService.criar(produtoCursos);
        return ResponseEntity.created(null).body(cursos);
    }

    @PatchMapping("{id}")
    public ResponseEntity<ProdutoCursos>atualizar(@RequestBody ProdutoCursos produtoCursos, @PathVariable Long id){
        ProdutoCursos cursosAtualizado = produtoCursosService.atualizar(produtoCursos,id);
        return ResponseEntity.created(null).body(cursosAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        produtoCursosService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ProdutoCursos>> listarCursos(){
        List<ProdutoCursos>listarCursos = produtoCursosService.listar();
        return ResponseEntity.ok(listarCursos);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProdutoCursos> obterCurso(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

//    List<ProdutoCursos> bancoDeDados = new ArrayList<>();
//
//    @GetMapping(path = "/qualquer")
//    public ResponseEntity<List<ProdutoCursos>> obterProduto(){
//        return ResponseEntity.ok(bancoDeDados);
//    }
//
//    @PostMapping
//    public ResponseEntity<String> criar(@RequestBody ProdutoCursos body){
//        bancoDeDados.add(body);
//        return new ResponseEntity<>("criou!!!", HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<String> put(@PathVariable int id){
//        return new ResponseEntity<>("REQUISAO PUT pelo ID !", HttpStatus.OK);
//    }
//
//    @PatchMapping
//    public ResponseEntity<String> patch(){
//        return new ResponseEntity<>("REQUIÇÃO PATCH!!!",HttpStatus.OK);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<String> delete(){
//        return new ResponseEntity<>("REQUISAO DELETE!!!", HttpStatus.OK);
//    }


//localhost:8080/produto/
//    Create - Criar - POST - cria um obejeto - criei
//    Read - LER - Get - Ler - ok
//    Update - Atualizar - Put/Patch - atualiza um objeto - aceitei
//    Delete - Deletar - Delete - exclui - nada

}


