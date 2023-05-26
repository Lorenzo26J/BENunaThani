package pe.edu.pe.benunathani.services;

import pe.edu.pe.benunathani.entities.Rutina_Recreativa;

import java.util.List;

public interface IRutina_RecreativaService {
    void insert(Rutina_Recreativa rutina_recreativa);

    List<Rutina_Recreativa> list();

    public void delete(int id);

    public Rutina_Recreativa ListId(int id);
}
