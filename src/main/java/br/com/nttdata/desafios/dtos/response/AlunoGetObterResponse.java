package br.com.nttdata.desafios.dtos.response;

public class AlunoGetObterResponse {

    private Long id;
    private String nome;
    private ProdutoCursosResponse produtoCursos;

    private String mensagem;

    public AlunoGetObterResponse() {
    }

    public AlunoGetObterResponse(Long id, String nome, ProdutoCursosResponse produtoCursos) {
        this.id = id;
        this.nome = nome;
        this.produtoCursos = produtoCursos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoCursosResponse getProdutoCursos() {
        return produtoCursos;
    }

    public void setProdutoCursos(ProdutoCursosResponse produtoCursos) {
        this.produtoCursos = produtoCursos;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
