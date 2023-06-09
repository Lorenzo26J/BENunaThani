package pe.edu.pe.benunathani.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.entities.Rutina_Recreativa;
import pe.edu.pe.benunathani.repositories.IRutina_RecreativaRepository;
import pe.edu.pe.benunathani.services.IRutina_RecreativaService;

import java.util.List;

@Service
public class Rutina_RecreativaServiceImplement implements IRutina_RecreativaService {

    @Autowired
    private IRutina_RecreativaRepository rR;
    @Override
    public void insert(Rutina_Recreativa rutina_recreativa){
        rR.save(rutina_recreativa);
    }
    @Override
    public List<Rutina_Recreativa> list(){
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

}
