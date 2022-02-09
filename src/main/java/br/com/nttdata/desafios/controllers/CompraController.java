package br.com.nttdata.desafios.controllers;

import br.com.nttdata.desafios.entitys.Compra;
import br.com.nttdata.desafios.services.CompraSeviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/compra")
public class CompraController {

    @Autowired
    private CompraSeviceInterface compraSevice;

    @PostMapping
    public ResponseEntity<Compra> criar(@RequestBody Compra compra){
        Compra compra1 = compraSevice.criar(compra);
        return ResponseEntity.created(null).body(compra1);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Compra>atualizar(@RequestBody Compra compra, @PathVariable Long id){
        Compra compraAtualizado = compraSevice.atualizar(compra,id);
        return ResponseEntity.created(null).body(compraAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        compraSevice.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Compra>> listarCursos(){
        List<Compra>listarCompras = compraSevice.listar();
        return ResponseEntity.ok(listarCompras);
    }

    @GetMapping("{id}")
    public ResponseEntity<Compra> obterCompra(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }
}
