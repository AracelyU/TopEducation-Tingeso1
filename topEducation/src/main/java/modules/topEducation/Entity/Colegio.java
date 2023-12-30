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
    Integer id;

    String tipo; // municipal, privado y subvencionado

    Integer nro_cuotas; // municipal: 10, privado: 3 y subvencionado: 7

    @OneToMany(mappedBy = "colegio")
    List<Estudiante> estudianteList;

    public String getTipo() {
        return tipo;
    }

    public Integer getNro_cuotas() {
        return nro_cuotas;
    }

}
