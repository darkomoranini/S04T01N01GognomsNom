package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estas ejecutando un proyecto Maven";
    }

    @GetMapping("/HelloWorld2")
    public String saluda2(@PathVariable(value = "nombre", required = false) String nombre) {
        if (nombre == null) {
            return "Hola, UNKNOWN. Estas ejecutando un proyecto Maven";
        }
        return "Hola, " + nombre + ". Estas ejecutando un proyecto Maven";
    }
}
