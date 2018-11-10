package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final String CODE="6902";
    private  final CodeBreaker codeBreaker= new CodeBreaker();

    @RequestMapping("/codebreaker/guess/{id}")
    public ResponseEntity<Resultado> guess(@PathVariable String id) {
        Resultado resultado = new Resultado();
        if(codeBreaker.guesst(id).equals("XXXX")){
            resultado.setResultado("GOOOOL");
        }else{
            resultado.setResultado("NOPE");
        }
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/codebreaker/guess")
    public ResponseEntity<Resultado> guess(@RequestBody Secret secret) {
        Resultado resultado = new Resultado();
        CodeBreaker c = new CodeBreaker();
        System.out.println("secret: "+secret.getSecret());
        resultado.setResultado(codeBreaker.guesst(secret.getSecret()));
        return ResponseEntity.ok().body(resultado);
    }
}
