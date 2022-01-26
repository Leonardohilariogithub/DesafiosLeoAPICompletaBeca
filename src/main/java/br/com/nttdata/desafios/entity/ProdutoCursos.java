package br.com.nttdata.desafios.entity;

public class ProdutoCursos {


    private long id;
private String nome;
private double valor;

    public ProdutoCursos(long id, String nome, double valor) {
        this.id = id;

        this.nome = nome;
        this.valor = valor;
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
