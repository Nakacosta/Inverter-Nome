package costa.anakajim.InverterNome;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    @GetMapping
    public String inicio(){

        return "Inverter Nome";
    }

    @PostMapping("/enviar")
    public String enviar(){
        return "Inverter Nome";
    }
}
