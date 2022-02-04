package br.com.nttdata.desafios.dtos.response;

import br.com.nttdata.desafios.entitys.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AlunoGetListarResponse {

    private String nome;
    private String nomeCurso;

       public AlunoGetListarResponse(Aluno aluno) {
        this.setNome(aluno.getNome());
        this.setNomeCurso(aluno.getProdutoCursos().getNome());
    }

}
