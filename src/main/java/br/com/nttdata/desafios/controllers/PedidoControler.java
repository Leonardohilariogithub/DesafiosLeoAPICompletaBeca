package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entitys.Pedido;
import br.com.nttdata.desafios.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoControler {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido>criar(@RequestBody Pedido pedido){
        Pedido pedidoCursos = pedidoService.criar(pedido);
        return ResponseEntity.created(null).body(pedidoCursos);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Pedido>atualizar(@RequestBody Pedido pedido, @PathVariable Long id){
        Pedido pedidoAtualizado = pedidoService.atualizar(pedido,id);
        return ResponseEntity.created(null).body(pedidoAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        pedidoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos(){
        List<Pedido>listarCursos = pedidoService.listar();
        return ResponseEntity.ok(listarCursos);
    }

    @GetMapping("{id}")
    public ResponseEntity<Pedido> obterCurso(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

}

//    @Autowired
//    private PedidoService pedidoService;
//
//    List<ProdutoCursos> bancoDeDados = new ArrayList<>();
//
//    @GetMapping(path = "/qualquer")
//    public ResponseEntity<List<ProdutoCursos>> obterProduto(){
//
//        return ResponseEntity.ok(bancoDeDados);
//    }
//
//    @PostMapping
//    public ResponseEntity<String> criar(@RequestBody ProdutoCursos body){
//        bancoDeDados.add(body);
//        return new ResponseEntity<>("criou!!!", HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<String> put(@PathVariable int id){
//        return new ResponseEntity<>("REQUISAO PUT pelo ID !",HttpStatus.OK);
//    }
//
//    @PatchMapping
//    public ResponseEntity<String> patch(){
//        return new ResponseEntity<>("REQUIÇÃO PATCH!!!", HttpStatus.OK) ;
//    }
//
//    @DeleteMapping
//    public ResponseEntity<String> delete(){
//        return new ResponseEntity<>("REQUISAO DELETE!!!",HttpStatus.OK) ;
//    }
//}
//localhost:8080/produto/
//    Create - Criar - POST - cria um obejeto - criei
//    Read - LER - Get - Ler - ok
//    Update - Atualizar - Put/Patch - atualiza um objeto - aceitei
//    Delete - Deletar - Delete - exclui - nada