package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.repositorys.AlunoRepository;
import br.com.nttdata.desafios.services.interfaces.AlunoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlunoService implements AlunoInterface {

        @Autowired
        private AlunoRepository alunoRepository;

        public Aluno criar(Aluno aluno){

            alunoRepository.save(aluno);
            Aluno alunoSalvo = alunoRepository.save(aluno);
            return alunoSalvo;
        }

        public Aluno atualizar( Aluno aluno,  Long id){
            Aluno alunoObtido = this.obter(id);
            alunoObtido.setNome(aluno.getNome());

            alunoRepository.save(alunoObtido);

            return  alunoObtido;
        }

        public void deletar(Long id){
            alunoRepository.deleteById(id);
        }

        public List<Aluno> listar(){

            List<Aluno> listaAluno = alunoRepository.findAll();
            return  listaAluno;
        }

        public Aluno obter(Long id){
            Aluno aluno = alunoRepository.findById(id).get();
            if(aluno == null){
                throw new RuntimeException("Aluno não encontrado");
            }
            return aluno;
        }
}
