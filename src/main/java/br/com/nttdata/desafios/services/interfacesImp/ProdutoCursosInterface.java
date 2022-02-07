package br.com.nttdata.desafios.services.interfacesImp;

import br.com.nttdata.desafios.entitys.ProdutoCursos;

import java.util.List;

public interface ProdutoCursosInterface {

    public ProdutoCursos criar(ProdutoCursos produto);

    public ProdutoCursos atualizar( ProdutoCursos produto,  Long id);

    public void deletar( Long id);

    public List<ProdutoCursos> listar();

    public ProdutoCursos obter(Long id);

}
