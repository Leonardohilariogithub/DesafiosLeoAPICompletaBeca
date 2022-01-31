package br.com.nttdata.desafios.repositorys;

import br.com.nttdata.desafios.entitys.ProdutoCursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoCursosRepository extends JpaRepository<ProdutoCursos,Long> {


}
