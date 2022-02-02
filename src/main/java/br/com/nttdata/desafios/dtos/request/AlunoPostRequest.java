package br.com.nttdata.desafios.dtos.request;

public class AlunoPostRequest {

    private String nome;
    private Long produtoCursos;

    public AlunoPostRequest() {
    }

    public AlunoPostRequest(String nome, Long produtoCursos) {
        this.nome = nome;
        this.produtoCursos = produtoCursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getProdutoCursos() {
        return produtoCursos;
    }

    public void setProdutoCursos(Long produtoCursos) {
        this.produtoCursos = produtoCursos;
    }
}