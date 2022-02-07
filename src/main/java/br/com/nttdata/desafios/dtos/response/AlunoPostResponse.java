package br.com.nttdata.desafios.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoPostResponse {

    private long id;
    private String nome;
    private ProdutoCursosResponse produtoCursos;

}
