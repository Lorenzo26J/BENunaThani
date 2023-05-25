package pe.edu.upc.demo.services;

import pe.edu.upc.demo.entities.Estado;

import java.util.List;

public interface IEstadoService {

    public void insert (Estado estado);
    List<Estado> list();
}
