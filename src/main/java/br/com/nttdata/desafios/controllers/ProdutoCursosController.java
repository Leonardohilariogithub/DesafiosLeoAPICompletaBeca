package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.dtos.request.ProdutoCursosPostRequest;
import br.com.nttdata.desafios.dtos.response.ProdutoCursosResponse;
import br.com.nttdata.desafios.services.ProdutoCursosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/produto")
public class ProdutoCursosController {

    private final ProdutoCursosService produtoCursosService;

    @PostMapping
    public ResponseEntity<ProdutoCursosResponse>criar(@RequestBody @Valid ProdutoCursosPostRequest produtoCursosPostRequest){
        ProdutoCursosResponse produtoCursosResponse = produtoCursosService.criar(produtoCursosPostRequest);
        return ResponseEntity.created(null).body(produtoCursosResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity<ProdutoCursosResponse>atualizar(@RequestBody ProdutoCursosPostRequest produtoCursosPostRequest, @PathVariable Long id){
        ProdutoCursosResponse produtoCursosResponse = produtoCursosService.atualizar(produtoCursosPostRequest,id);
        return ResponseEntity.created(null).body(produtoCursosResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        produtoCursosService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ProdutoCursosResponse>> listarCursos(){
        List<ProdutoCursosResponse>listarCursos = produtoCursosService.listar();
        return ResponseEntity.ok(listarCursos);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProdutoCursosResponse> obterCurso(@PathVariable Long id){
        ProdutoCursosResponse produtoCursosResponse = produtoCursosService.obter(id);
        return ResponseEntity.ok(produtoCursosResponse);
    }

}


