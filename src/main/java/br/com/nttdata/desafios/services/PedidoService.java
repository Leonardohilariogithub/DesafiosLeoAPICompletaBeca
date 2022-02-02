package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Pedido;
import br.com.nttdata.desafios.repositorys.PedidoRepository;
import br.com.nttdata.desafios.services.interfaces.PedidoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements PedidoInterface {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criar(Pedido pedido){
        pedidoRepository.save(pedido);
        Pedido pedidoSalvo = pedidoRepository.save(pedido);
        return pedidoSalvo;
    }

    public Pedido atualizar( Pedido pedido,  Long id){
        Pedido pedidoObtido = this.obter(id);
        pedidoObtido.setQuantidade(pedido.getQuantidade());
        pedidoRepository.save(pedidoObtido);
        return  pedidoObtido;
    }

    public void deletar( Long id){
        pedidoRepository.deleteById(id);
    }

    public List<Pedido> listar(){

        List<Pedido> listaPedido = pedidoRepository.findAll();
        return  listaPedido;
    }

    public Pedido obter(Long id){

        Pedido pedido = pedidoRepository.findById(id).get();
        if(pedido == null){
            throw new RuntimeException("Aluno não encontrado");
        }
        return pedido;
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
