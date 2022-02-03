package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.dtos.response.AlunoGetListarResponse;
import br.com.nttdata.desafios.dtos.response.AlunoGetObterResponse;
import br.com.nttdata.desafios.dtos.response.AlunoPostResponse;
import br.com.nttdata.desafios.dtos.response.ProdutoCursosResponse;
import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import br.com.nttdata.desafios.repositorys.AlunoRepository;
import br.com.nttdata.desafios.services.interfaces.AlunoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        alunoPostResponse.setMensagem(alunoSalvo.getNome() + " Comprou Curso com sucesso!");

        return alunoPostResponse;
    }

        public Aluno atualizar( Aluno aluno,  Long id){
            Aluno alunoObtido = alunoRepository.findById(id).get();
            alunoObtido.setNome(aluno.getNome());
            alunoRepository.save(alunoObtido);
            return  alunoObtido;
        }

        public void deletar(Long id){
            alunoRepository.deleteById(id);
        }

        public List<AlunoGetListarResponse> listar(){

            List<Aluno> listaAluno = alunoRepository.findAll();

            List<AlunoGetListarResponse> alunoGetListarResponse = new ArrayList<>();
            listaAluno.stream().forEach(aluno -> alunoGetListarResponse.add(new AlunoGetListarResponse(aluno)));

            return  alunoGetListarResponse;
        }

        public AlunoGetObterResponse obter(Long id){
            Aluno aluno = alunoRepository.findById(id).get();

            //mapeamento
            AlunoGetObterResponse alunoGetObterResponse = new AlunoGetObterResponse();
            alunoGetObterResponse.setId(aluno.getId());
            alunoGetObterResponse.setNome(aluno.getNome());

            ProdutoCursosResponse produtoCursosResponse = new ProdutoCursosResponse();
            produtoCursosResponse.setId(aluno.getProdutoCursos().getId());
            produtoCursosResponse.setNome(aluno.getProdutoCursos().getNome());

            alunoGetObterResponse.setProdutoCursos(produtoCursosResponse);
            alunoGetObterResponse.setMensagem("Aluno matriculado com SUCESSO!!!");


//            if(aluno == null){
//                throw new RuntimeException("Aluno não encontrado");
//            }
            return alunoGetObterResponse;
        }
}
