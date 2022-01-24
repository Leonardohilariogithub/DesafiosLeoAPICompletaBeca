package br.com.nttdata.desafios.entity;

<<<<<<< HEAD
public class Compra {

    double valorTotal;
=======
import lombok.Getter;
import lombok.Setter;

public class Compra {
@Getter
@Setter
    private double valorTotal;

    public Compra(double valorTotal) {
        this.valorTotal = valorTotal;
    }
>>>>>>> ad71a5571d60f06098645bffbaf6fe4fa9c00798
}
