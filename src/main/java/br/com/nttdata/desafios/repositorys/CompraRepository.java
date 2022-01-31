package br.com.nttdata.desafios.repositorys;

import br.com.nttdata.desafios.entitys.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {


}
