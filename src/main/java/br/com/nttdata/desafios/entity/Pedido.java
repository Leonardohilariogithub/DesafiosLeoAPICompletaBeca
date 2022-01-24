package br.com.nttdata.desafios.entity;

<<<<<<< HEAD
public class Pedido {
    private double quantidade;
    private double desconto;

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
=======
import lombok.Getter;
import lombok.Setter;

public class Pedido {
    @Getter
    @Setter
    private double quantidade;
    private double desconto;

    public Pedido(double quantidade, double desconto) {
        this.quantidade = quantidade;
>>>>>>> ad71a5571d60f06098645bffbaf6fe4fa9c00798
        this.desconto = desconto;
    }
}
