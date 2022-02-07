package br.com.nttdata.desafios.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String cpf;

    @ManyToOne
    private ProdutoCursos produtoCursos;

    @ManyToOne
    private Compra compra;

    @ManyToOne
    private Pedido pedido;

    public Aluno(long id, String nome, String cpf) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;

    }

}
