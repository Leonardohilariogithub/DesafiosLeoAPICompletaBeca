package br.com.nttdata.desafios.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoCursosPostRequest {

    private long id;

    @NotBlank(message = "{nome.not.blank")
    @Size(min = 2, max = 30)
    private String nome;

    @Positive
    private double valor;
}
