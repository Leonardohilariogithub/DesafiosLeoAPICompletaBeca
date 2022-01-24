package entityControler;

import org.springframework.web.bind.annotation.*;

@RestController

public class AlunoController {

    @GetMapping
    public String get(){
        return "requisao GET";
    }
    @PostMapping
    public String post(){
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
