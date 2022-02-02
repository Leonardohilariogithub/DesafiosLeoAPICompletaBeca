package br.com.nttdata.desafios.entitys;

import javax.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double quantidade;
    private double desconto;

    @ManyToOne
    private ProdutoCursos produtoCursos;

    public Pedido(long id, double quantidade, double desconto) {
        this.id = id;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Pedido(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public ProdutoCursos getProdutoCursos() {
        return produtoCursos;
    }

    public void setProdutoCursos(ProdutoCursos produtoCursos) {
        this.produtoCursos = produtoCursos;
    }
}
