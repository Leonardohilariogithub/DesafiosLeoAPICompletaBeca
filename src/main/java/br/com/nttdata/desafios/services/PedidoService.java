package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    public Pedido criar(Pedido pedido){
        pedido.setId(2l);
        return pedido;
    }

    public Pedido atualizar( Pedido pedido,  Long id){
        pedido.setId(id);
        return  pedido;
    }

    public void deletar( Long id){
        //
    }

    public List<Pedido> listar(){

        Pedido pedido1 = new Pedido();
        pedido1.setId(3L);
        pedido1.setQuantidade(2);
        pedido1.setDesconto(0.10);
        return  List.of(pedido1);
    }

    public Pedido obter(Long id){
        Pedido obterPedido = new Pedido();
        obterPedido.setId(id);
        return obterPedido;
    }

//    List<ProdutoCursos> bancoDeDados = new ArrayList<>();

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
