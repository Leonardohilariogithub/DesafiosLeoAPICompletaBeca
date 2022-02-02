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

    @ManyToOne
    private Compra compra;

    @ManyToOne
    private Pedido pedido;

    public Aluno(long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;

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

    public ProdutoCursos getProdutoCursos() {
        return produtoCursos;
    }

    public void setProdutoCursos(ProdutoCursos produtoCursos) {
        this.produtoCursos = produtoCursos;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
