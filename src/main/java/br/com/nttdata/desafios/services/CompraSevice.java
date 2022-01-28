package br.com.nttdata.desafios.services;

import br.com.nttdata.desafios.entitys.Compra;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompraSevice {
    public Compra criar(Compra compra){
        compra.setId(1L);
        return compra;
    }

    public Compra atualizar( Compra compra,  Long id){
        compra.setId(id);
        return  compra;
    }

    public void deletar( Long id){
        //
    }

    public List<Compra> listar(){

        Compra compra1 = new Compra();
        compra1.setId(2L);
        compra1.setValorTotal(200);
        return  List.of(compra1);
    }

    public Compra obter(Long id){
        Compra obterCurso = new Compra();
        obterCurso.setId(id);
        return obterCurso;
    }

}
