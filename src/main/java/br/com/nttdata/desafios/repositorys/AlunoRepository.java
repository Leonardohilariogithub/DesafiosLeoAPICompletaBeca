package br.com.nttdata.desafios.repositorys;

import br.com.nttdata.desafios.entitys.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}

