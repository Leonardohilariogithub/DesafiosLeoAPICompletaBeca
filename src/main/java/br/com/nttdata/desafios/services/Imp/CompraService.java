package br.com.nttdata.desafios.services.Imp;

import br.com.nttdata.desafios.entitys.Compra;

import java.util.List;

public interface CompraService {

    public Compra criar(Compra compra);

    public Compra atualizar( Compra compra,  Long id);

    public void deletar( Long id);

    public List<Compra> listar();

    public Compra obter(Long id);

}
