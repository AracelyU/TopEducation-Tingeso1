package modules.topEducation.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "colegios")
public class Colegio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_colegio;

    String tipo_colegio; // municipal, privado y subvencionado

    String nombre_colegio; // nombre del colegio

    Integer nro_cuotas; // municipal: 10, privado: 3 y subvencionado: 7

    // un colegio tiene muchos estudiantes
    @OneToMany(mappedBy = "colegio")
    List<Estudiante> lista_estudiantes;

}
