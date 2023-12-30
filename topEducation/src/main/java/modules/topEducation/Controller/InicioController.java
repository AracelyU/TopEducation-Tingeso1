package modules.topEducation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {


    @GetMapping("/")
    public String inicio(Model model){

        String hola = "hola mundo model";
        model.addAttribute("hola2", hola);

        return "inicio";
    }


}
