package br.com.nttdata.desafios.controllers;


import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.dtos.response.AlunoDeleteResponse;
import br.com.nttdata.desafios.dtos.response.AlunoPostResponse;
import br.com.nttdata.desafios.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoPostResponse> criar(@RequestBody @Valid AlunoPostRequest alunoPostRequest){

        AlunoPostResponse alunoPostResponse = alunoService.criar(alunoPostRequest);
        return ResponseEntity.created(null).body(alunoPostResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity<AlunoPostResponse>atualizar(@RequestBody AlunoPostRequest alunoPostRequest, @PathVariable Long id){
        AlunoPostResponse alunoPostResponse = alunoService.atualizar(alunoPostRequest,id);

        return ResponseEntity.ok(alunoPostResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<AlunoDeleteResponse> delete(@PathVariable Long id){
        alunoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<AlunoPostResponse>> listarCursos(){
        List<AlunoPostResponse>ListaAlunos = alunoService.listar();
        return ResponseEntity.ok(ListaAlunos);
    }

    @GetMapping("{id}")
    public ResponseEntity<AlunoPostResponse> obterCurso(@PathVariable Long id){
        AlunoPostResponse alunoPostResponse = alunoService.obter(id);

        return ResponseEntity.ok(alunoPostResponse);
    }

}
