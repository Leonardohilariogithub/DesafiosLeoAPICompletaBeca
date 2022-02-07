package br.com.nttdata.desafios.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoGetObterResponse {

    private Long id;
    private String nome;
    private ProdutoCursosResponse produtoCursos;

    private String mensagem;
}
