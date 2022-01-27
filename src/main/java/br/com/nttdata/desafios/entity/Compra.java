package br.com.nttdata.desafios.entity;


public class Compra {

    private double valorTotal;

    public Compra(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
