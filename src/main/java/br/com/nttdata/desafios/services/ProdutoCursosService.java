package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.dtos.request.ProdutoCursosPostRequest;
import br.com.nttdata.desafios.dtos.response.ProdutoCursosResponse;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import br.com.nttdata.desafios.exceptions.TamanhoNaoValidoException;
import br.com.nttdata.desafios.mappers.ProdutoCursosMapper;
import br.com.nttdata.desafios.mappers.ProdutoCursosToProdutoCursoResponse;
import br.com.nttdata.desafios.mappers.ProdutoCursosUpdate;
import br.com.nttdata.desafios.repositorys.ProdutoCursosRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
@RequiredArgsConstructor
public class ProdutoCursosService {

       private final ProdutoCursosRepository produtoCursosRepository;
       private final ProdutoCursosMapper produtoCursosMapper;

       private final ProdutoCursosToProdutoCursoResponse produtoCursosToProdutoCursoResponse;
       private final ProdutoCursosUpdate produtoCursosUpdate;

        public ProdutoCursosResponse criar(ProdutoCursosPostRequest produtoCursosPostRequest){
            if(produtoCursosPostRequest.getNome().length() <= 2) {
                throw new TamanhoNaoValidoException("Não pode ter menos de 3 letras, por favor corrigir!");
            }

            ProdutoCursos produtoCursos = produtoCursosMapper.toModel(produtoCursosPostRequest);

            produtoCursosRepository.save(produtoCursos);

            ProdutoCursosResponse produtoCursosResponse = produtoCursosToProdutoCursoResponse.toResponse(produtoCursos);

            return produtoCursosResponse;
        }

        public ProdutoCursosResponse atualizar(@NotNull ProdutoCursosPostRequest produtoCursosPostRequest, Long id){
            ProdutoCursos produtoCursosObtido = produtoCursosRepository.findById(id).get();

            produtoCursosUpdate.atualizar(produtoCursosPostRequest,produtoCursosObtido);

            produtoCursosRepository.save(produtoCursosObtido);

            return  produtoCursosToProdutoCursoResponse.toResponse(produtoCursosObtido);
        }

        public void deletar( Long id){
           produtoCursosRepository.deleteById(id);
        }

        public List<ProdutoCursosResponse> listar(){
            List<ProdutoCursos> listaProdutoCursos = produtoCursosRepository.findAll();

            return  listaProdutoCursos
                    .stream()
                    .map(produtoCursosToProdutoCursoResponse::toResponse)
                    .collect(Collectors.toList());

        }

        public ProdutoCursosResponse obter(Long id){
            ProdutoCursos produtoCursos = produtoCursosRepository.findById(id).get();

            if(produtoCursos == null){
                throw new RuntimeException("Curso não encontrado");
            }
            return produtoCursosToProdutoCursoResponse.toResponse(produtoCursos);
        }


//    List<ProdutoCursos> bancoDeDados = new ArrayList<>();
//
//    public List<ProdutoCursos> obterProduto(){
//        return bancoDeDados;
//    }
//
//    public String criar(ProdutoCursos body){
//        bancoDeDados.add(body);
//        return "criou!!!";
//    }
//
//    public String put( int id){
//        return "REQUISAO PUT pelo ID !";
//    }
//
//    public String patch(){
//        return "REQUIÇÃO PATCH!!!";
//    }
//
//    public String delete(){
//        return "REQUISAO DELETE!!!";
//    }

}
