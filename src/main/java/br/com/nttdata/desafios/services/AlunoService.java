package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.dtos.response.AlunoPostResponse;
import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.mappers.AlunoMapper;
import br.com.nttdata.desafios.mappers.AlunoToResponseMapper;
import br.com.nttdata.desafios.mappers.AlunoUpdate;
import br.com.nttdata.desafios.repositorys.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlunoService {

        private final ProdutoCursosService produtoCursosService;
        private final AlunoRepository alunoRepository;
        private final AlunoMapper alunoMapper;
        private final AlunoToResponseMapper alunoToResponseMapper;
        private final AlunoUpdate alunoUpdate;

//mapstruct
        public AlunoPostResponse criar(AlunoPostRequest alunoPostRequest){

            Aluno aluno = alunoMapper.toModel(alunoPostRequest);

            alunoRepository.save(aluno);

            AlunoPostResponse alunoPostResponse = alunoToResponseMapper.toResponse(aluno);

            return alunoPostResponse;
        }

        public AlunoPostResponse atualizar(AlunoPostRequest alunoPostRequest,  Long id){

            Aluno alunoObtido = alunoRepository.findById(id).get();

            AlunoUpdate.atualizar(alunoPostRequest, alunoObtido);

            alunoRepository.save(alunoObtido);

            return alunoToResponseMapper.toResponse(alunoObtido);
        }

        public void deletar(Long id){
                alunoRepository.deleteById(id);
            }

        public List<AlunoPostResponse> listar(){

            List<Aluno> listaAluno = alunoRepository.findAll();

            return listaAluno
                    .stream()
                    .map(alunoToResponseMapper::toResponse)
                    .collect(Collectors.toList());

        }

        public AlunoPostResponse obter(Long id){
            Aluno aluno = alunoRepository.findById(id).get();

            return alunoToResponseMapper.toResponse(aluno);
        }
}
