package br.com.nttdata.desafios.dtos.response;

import br.com.nttdata.desafios.entitys.Aluno;

public class AlunoGetListarResponse {

    private String nome;
    private String nomeCurso;

    public AlunoGetListarResponse() {
    }

    public AlunoGetListarResponse(Aluno aluno) {
        this.setNome(aluno.getNome());
        this.setNomeCurso(aluno.getProdutoCursos().getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
