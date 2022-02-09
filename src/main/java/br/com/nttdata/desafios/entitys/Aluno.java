package br.com.nttdata.desafios.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 35)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
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
