package entityControler;

import org.springframework.web.bind.annotation.*;

@RestController

public class ProdutoCursosController {

    @GetMapping(path = "/produto")
    public ProdutoCursos obterProduto(){
        return new ProdutoCursos("JAVA", 100);
    }


}
