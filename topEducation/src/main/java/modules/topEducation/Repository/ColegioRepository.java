package modules.topEducation.Repository;

import modules.topEducation.Entity.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColegioRepository extends JpaRepository<Colegio, Integer> {


}
