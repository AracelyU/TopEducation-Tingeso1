package modules.topEducation.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    String rut;
    String nombre;
    String apellido;
    Date fecha_nacimiento;
    String nombre_colegio;
    Integer anio_egreso;

    @ManyToOne
    @JoinColumn(name = "fk_colegio")
    Colegio colegio;

}
