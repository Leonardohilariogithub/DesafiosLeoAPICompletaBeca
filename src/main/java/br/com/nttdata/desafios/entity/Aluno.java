package br.com.nttdata.desafios.entity;

import lombok.Getter;
import lombok.Setter;

public class Aluno {

@Getter
@Setter
    private String nome;
    private String cpf;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
