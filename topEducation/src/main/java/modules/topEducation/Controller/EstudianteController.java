package modules.topEducation.Controller;


import modules.topEducation.Entity.Colegio;
import modules.topEducation.Entity.Estudiante;
import modules.topEducation.Service.ColegioService;
import modules.topEducation.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @Autowired
    ColegioService colegioService;

    // llegas a la pagina que lista los estudiantes
    @GetMapping("/estudiantes")
    public String mostrarEstudiantes(Model model){
        // se envia la lista de estudiantes
        List<Estudiante> estudiantes = estudianteService.mostrarEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "listaEstudiantes";
    }

    // llegas a la página de registrar estudiante
    @GetMapping("estudiantes/registro")
    public String registroEstudiante(Model model){
        // se envia la información de colegios
        List<Colegio> colegios = colegioService.mostrarColegios();
        model.addAttribute("colegios", colegios);
        return "registrarEstudiante";
    }

    // registrar el estudiante
    @PostMapping("/registrarEstudiante")
    public String registrarEstudiante(Estudiante estudiante, Model model){
        // verifica que el estudiante este bien registrado
        //
        estudianteService.guardarEstudiante(estudiante);
        model.addAttribute("registro", "Se ha registrado el estudiante con éxito!");
        return "redirect:/listaEstudiantes";  // tras el registro se va a la página de estudiantes


    }





}
