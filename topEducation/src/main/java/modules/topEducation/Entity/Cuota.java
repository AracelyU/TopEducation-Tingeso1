package modules.topEducation.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "cuotas")
public class Cuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cuota;

    // muchas cuotas están asociados a un pago
    @ManyToOne
    @JoinColumn(name = "fk_pago")
    public Cuota cuota;


}
