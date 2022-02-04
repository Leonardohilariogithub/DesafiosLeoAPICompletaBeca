package br.com.nttdata.desafios.controllers;


import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.dtos.response.AlunoDeleteResponse;
import br.com.nttdata.desafios.dtos.response.AlunoGetListarResponse;
import br.com.nttdata.desafios.dtos.response.AlunoGetObterResponse;
import br.com.nttdata.desafios.dtos.response.AlunoPostResponse;
import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoPostResponse> criar(@RequestBody @Valid AlunoPostRequest alunoPostRequest){

        AlunoPostResponse alunoPostResponse = alunoService.criar(alunoPostRequest);
        return ResponseEntity.created(null).body(alunoPostResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Aluno>atualizar(@RequestBody Aluno aluno, @PathVariable Long id){
        Aluno alunoAtualizado = alunoService.atualizar(aluno,id);
        return ResponseEntity.created(null).body(alunoAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<AlunoDeleteResponse> delete(@PathVariable Long id){
        alunoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<AlunoGetListarResponse>> listarCursos(){
        List<AlunoGetListarResponse>alunoGetListarResponses = alunoService.listar();
        return ResponseEntity.ok(alunoGetListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity<AlunoGetObterResponse> obterCurso(@PathVariable Long id){
        AlunoGetObterResponse alunoGetObterResponse = alunoService.obter(id);

        return ResponseEntity.ok(alunoGetObterResponse);
    }

}
