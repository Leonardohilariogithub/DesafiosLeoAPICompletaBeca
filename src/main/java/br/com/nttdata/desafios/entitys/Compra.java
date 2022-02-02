package br.com.nttdata.desafios.entitys;

import javax.persistence.*;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double valorTotal;

    public Compra(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Compra() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
