package br.com.nttdata.desafios.services.interfacesImp;

import br.com.nttdata.desafios.entitys.Aluno;

import java.util.List;

public interface AlunoInterface {

    public Aluno criar(Aluno aluno);

    public Aluno atualizar( Aluno aluno,  Long id);

    public void deletar(Long id);

    public List<Aluno> listar();

    public Aluno obter(Long id);

}
