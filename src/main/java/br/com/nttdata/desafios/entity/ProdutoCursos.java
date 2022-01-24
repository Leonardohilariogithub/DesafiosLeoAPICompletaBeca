package br.com.nttdata.desafios.entity;

import lombok.Getter;
import lombok.Setter;

public class ProdutoCursos {
    @Getter
    @Setter
private String nome;
private double valor;

    public ProdutoCursos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void comprar(){

    }

    public void retirar(){

    }
}
