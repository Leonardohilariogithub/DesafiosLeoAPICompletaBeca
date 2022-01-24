package br.com.nttdata.desafios.entity;

<<<<<<< HEAD
public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
=======
import lombok.Getter;
import lombok.Setter;

public class Aluno {

@Getter
@Setter
    private String nome;
    private String cpf;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
>>>>>>> ad71a5571d60f06098645bffbaf6fe4fa9c00798
    }
}
