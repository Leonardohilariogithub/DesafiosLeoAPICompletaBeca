package br.com.nttdata.desafios.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double quantidade;
    private double desconto;

    @ManyToOne
    private ProdutoCursos produtoCursos;

    @ManyToOne
    private Aluno aluno;

    public Pedido(long id, double quantidade, double desconto) {
        this.id = id;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public void setProdutoCursos(ProdutoCursos produtoCursos) {
        this.produtoCursos = produtoCursos;
    }
}
