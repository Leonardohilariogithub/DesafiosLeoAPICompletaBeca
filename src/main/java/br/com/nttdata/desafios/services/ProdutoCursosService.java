package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Aluno;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import br.com.nttdata.desafios.repositorys.ProdutoCursosRepository;
import br.com.nttdata.desafios.services.interfaces.ProdutoCursosInterface;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoCursosService implements ProdutoCursosInterface {

    @Autowired
    private ProdutoCursosRepository produtoCursosRepository;

        public ProdutoCursos criar( ProdutoCursos produto){
            produtoCursosRepository.save(produto);
            ProdutoCursos produtoCursosSalvo = produtoCursosRepository.save(produto);
            return produtoCursosSalvo;
        }

        public ProdutoCursos atualizar(@NotNull ProdutoCursos produto, Long id){
            ProdutoCursos produtoCursosObtido = this.obter(id);
            produtoCursosObtido.setNome(produto.getNome());

            produtoCursosRepository.save(produtoCursosObtido);

            return  produtoCursosObtido;
        }

        public void deletar( Long id){
           produtoCursosRepository.deleteById(id);
        }

        public List<ProdutoCursos> listar(){

            List<ProdutoCursos> listaProdutoCursos = produtoCursosRepository.findAll();
            return  listaProdutoCursos;
        }

        public ProdutoCursos obter(Long id){
            ProdutoCursos produtoCursos = produtoCursosRepository.findById(id).get();
            if(produtoCursos == null){
                throw new RuntimeException("Curso não encontrado");
            }
            return produtoCursos;
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
