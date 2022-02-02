package br.com.nttdata.desafios.entitys;

import javax.persistence.*;

@Entity
@Table(name = "produtoCursos")
public class ProdutoCursos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double valor;

    public ProdutoCursos(long id,String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public ProdutoCursos(){

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
