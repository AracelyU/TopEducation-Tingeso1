package modules.topEducation.Service;

import modules.topEducation.Entity.Estudiante;
import modules.topEducation.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {


    @Autowired
    EstudianteRepository estudianteRepository;

    // mostrar la lista de estudiantes
    public List<Estudiante> mostrarEstudiantes(){ return estudianteRepository.findAll(); }


    // guardar estudiante
    public Estudiante guardarEstudiante(Estudiante estudiante){ return estudianteRepository.save(estudiante); }



}
