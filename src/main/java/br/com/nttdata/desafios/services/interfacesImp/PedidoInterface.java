package br.com.nttdata.desafios.services.interfacesImp;

import br.com.nttdata.desafios.entitys.Pedido;

import java.util.List;

public interface PedidoInterface {

    public Pedido criar(Pedido pedido);

    public Pedido atualizar( Pedido pedido,  Long id);

    public void deletar( Long id);

    public List<Pedido> listar();

    public Pedido obter(Long id);

}
