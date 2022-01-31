package br.com.nttdata.desafios.entitys;

import javax.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;

    @ManyToOne
    private ProdutoCursos produtoCursos;

    public Aluno(long id, String nome, String cpf, ProdutoCursos produtoCursos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.produtoCursos = produtoCursos;
    }
    public Aluno(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
