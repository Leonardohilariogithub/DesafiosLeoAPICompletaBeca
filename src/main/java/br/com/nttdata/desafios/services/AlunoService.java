package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.dtos.response.AlunoPostResponse;
import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import br.com.nttdata.desafios.repositorys.AlunoRepository;
import br.com.nttdata.desafios.services.interfaces.AlunoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlunoService {
        @Autowired
        private ProdutoCursosService produtoCursosService;

        @Autowired
        private AlunoRepository alunoRepository;

    public AlunoPostResponse criar(AlunoPostRequest alunoPostRequest){

        ProdutoCursos produtoObtido = produtoCursosService.obter(alunoPostRequest.getProdutoCursos());

        Aluno aluno = new Aluno();
        aluno.setNome(alunoPostRequest.getNome());
        aluno.setProdutoCursos(produtoObtido);

        Aluno alunoSalvo = alunoRepository.save(aluno);

        AlunoPostResponse alunoPostResponse = new AlunoPostResponse();
        alunoPostResponse.setMatricula(alunoSalvo.getId());
        alunoPostResponse.setMensagem(alunoSalvo.getNome() + " Aluno salvo com sucesso!");

        return alunoPostResponse;
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
