package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.ProdutoCursos;
import br.com.nttdata.desafios.services.interfaces.ProdutoCursosInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoCursosService implements ProdutoCursosInterface {

        public ProdutoCursos criar( ProdutoCursos produto){
            produto.setId(1L);
            return produto;
        }

        public ProdutoCursos atualizar( ProdutoCursos produto,  Long id){
            produto.setId(id);
            return  produto;
        }

        public void deletar( Long id){
            //
        }

        public List<ProdutoCursos> listar(){

            ProdutoCursos curso1 = new ProdutoCursos();
            curso1.setId(2L);
            curso1.setNome("php");
            curso1.setValor(1000);
            return  List.of(curso1);
        }

        public ProdutoCursos obter(Long id){
            ProdutoCursos obterCurso = new ProdutoCursos();
            obterCurso.setId(id);
            return obterCurso;
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
