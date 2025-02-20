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
    private String rut;

    private String nombre_estudiante;
    private String apellido_estudiante;
    private Date fecha_nacimiento;
    private Integer anio_egreso; // año en que ingreso

    // muchos estudiantes estas asociados a un colegio
    @ManyToOne
    @JoinColumn(name = "fk_colegio")
    public Colegio colegio;

}
