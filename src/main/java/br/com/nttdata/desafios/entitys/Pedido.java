package br.com.nttdata.desafios.entitys;

public class Pedido {

    private long id;
    private double quantidade;
    private double desconto;

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
}
