package br.com.nttdata.desafios.entity;

import lombok.Getter;
import lombok.Setter;

public class ProdutoCursos {
    @Getter
    @Setter

    private long id;
private String nome;
private double valor;

    public ProdutoCursos(long id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

}
