package pe.edu.upc.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo.entities.Estado;
import pe.edu.upc.demo.repositories.IEstadoRepository;
import pe.edu.upc.demo.services.IEstadoService;

import java.util.List;

@Service
public class EstadoServiceImplement implements IEstadoService {
    @Autowired
    private  IEstadoRepository eR;

    @Override
    public void insert(Estado estado) {eR.save(estado);}

    @Override
    public List<Estado> list() { return eR.findAll();}


}
