package br.com.nttdata.desafios.repositorys;

import br.com.nttdata.desafios.entitys.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


}
