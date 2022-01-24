package br.com.nttdata.desafios.entity;

import lombok.Getter;
import lombok.Setter;

public class Pedido {
    @Getter
    @Setter
    private double quantidade;
    private double desconto;

    public Pedido(double quantidade, double desconto) {
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
}
