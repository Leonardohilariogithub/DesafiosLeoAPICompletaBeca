package br.com.nttdata.desafios.entity;

<<<<<<< HEAD
public class ProdutoCursos<plublic> {
private String nome;
private double valor;

    public ProdutoCursos(String nome, double valor) {
=======
import lombok.Getter;
import lombok.Setter;

public class ProdutoCursos {
    @Getter
    @Setter

    private long id;
private String nome;
private double valor;

    public ProdutoCursos(long id, String nome, double valor) {
        this.id = id;
>>>>>>> ad71a5571d60f06098645bffbaf6fe4fa9c00798
        this.nome = nome;
        this.valor = valor;
    }

<<<<<<< HEAD
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

    void comprar(){

    }

    void retirar(){

    }
=======
>>>>>>> ad71a5571d60f06098645bffbaf6fe4fa9c00798
}
