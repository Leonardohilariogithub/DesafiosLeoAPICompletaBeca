package br.com.nttdata.desafios.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoCursosPostRequest {
    private long id;
    private String nome;
    private double valor;
}
