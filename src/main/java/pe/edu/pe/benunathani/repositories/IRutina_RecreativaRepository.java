package pe.edu.pe.benunathani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.entities.Rutina_Recreativa;

@Repository
public interface IRutina_RecreativaRepository extends JpaRepository<Rutina_Recreativa, Integer> {
}
