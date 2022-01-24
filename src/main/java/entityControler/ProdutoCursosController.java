package entityControler;

import br.com.nttdata.desafios.entity.ProdutoCursos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoCursosController {

    @GetMapping
    public String get(){
        return "requisao GET";
    }
    @PostMapping
    public String post(@RequestBody ProdutoCursos p1){
        return "requisao POST";
    }
    @PutMapping
    public String put(){
        return "requisao PUT";
    }
    @PatchMapping
    public String patch(){
        return "requisao PATCH";
    }

    @DeleteMapping
    public String delete(){
        return "requisao DELETE";
    }

}
