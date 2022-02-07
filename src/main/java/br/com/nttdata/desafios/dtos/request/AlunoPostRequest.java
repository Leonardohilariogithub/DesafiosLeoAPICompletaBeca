package br.com.nttdata.desafios.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoPostRequest {

    @NotBlank(message = "{nome.not.blank")
    @Size(min = 3, max = 30)
    private String nome;

    private ProdutoCursosPostRequest produtoCursos;

}