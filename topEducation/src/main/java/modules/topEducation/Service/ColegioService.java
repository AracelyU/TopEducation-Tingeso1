package modules.topEducation.Service;


import modules.topEducation.Entity.Colegio;
import modules.topEducation.Repository.ColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColegioService {

    @Autowired
    ColegioRepository colegioRepository;

    public List<Colegio> mostrarColegios(){
        return colegioRepository.findAll();
    }



}
