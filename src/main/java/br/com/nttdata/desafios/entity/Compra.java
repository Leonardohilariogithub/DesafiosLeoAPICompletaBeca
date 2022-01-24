package br.com.nttdata.desafios.entity;

import lombok.Getter;
import lombok.Setter;

public class Compra {
@Getter
@Setter
    private double valorTotal;

    public Compra(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
