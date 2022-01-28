package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlunoService {

        public Aluno criar(Aluno aluno){
            aluno.setId(3l);
            return aluno;
        }

        public Aluno atualizar( Aluno aluno,  Long id){
            aluno.setId(id);
            return  aluno;
        }

        public void deletar(Long id){
            //
        }

        public List<Aluno> listar(){

            Aluno aluno1 = new Aluno();
            aluno1.setId(2L);
            aluno1.setNome("php");
            aluno1.setCpf("123456789");
            return  List.of(aluno1);
        }

        public Aluno obter(Long id){
            Aluno obterCurso = new Aluno();
            obterCurso.setId(id);
            return obterCurso;
        }
}
