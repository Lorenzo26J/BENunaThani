package pe.edu.pe.benunathani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.entities.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

}
