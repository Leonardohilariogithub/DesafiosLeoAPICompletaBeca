package br.com.nttdata.desafios.controllers;


import br.com.nttdata.desafios.dtos.request.AlunoRequestDto;
import br.com.nttdata.desafios.dtos.response.AlunoResponseDto;
import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno){
        Aluno aluno1 = alunoService.criar(aluno);
        return ResponseEntity.created(null).body(aluno1);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Aluno>atualizar(@RequestBody Aluno aluno, @PathVariable Long id){
        Aluno alunoAtualizado = alunoService.atualizar(aluno,id);
        return ResponseEntity.created(null).body(alunoAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        alunoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listarCursos(){
        List<Aluno>listarCursos = alunoService.listar();
        return ResponseEntity.ok(listarCursos);
    }

    @GetMapping("{id}")
    public ResponseEntity<Aluno> obterCurso(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

}
