package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Compra;
import br.com.nttdata.desafios.repositorys.CompraRepository;
import br.com.nttdata.desafios.services.interfacesImp.CompraInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CompraSevice implements CompraInterface {


    private final CompraRepository compraRepository;

    public Compra criar(Compra compra){
        compraRepository.save(compra);
        Compra compraSalva = compraRepository.save(compra);
        return compraSalva;
    }

    public Compra atualizar( Compra compra,  Long id){

        Compra compraObtida = this.obter(id);
        compraObtida.setValorTotal(compra.getValorTotal());
        compraRepository.save(compraObtida);
        return  compraObtida;
    }

    public void deletar( Long id){
        compraRepository.deleteById(id);
    }

    public List<Compra> listar(){

        List<Compra> listaCompra = compraRepository.findAll();
        return  listaCompra;
    }

    public Compra obter(Long id){


        Compra compra = compraRepository.findById(id).get();
        if(compra == null){
            throw new RuntimeException("compra nao encontrada");

        }
        return compra;
    }

}
