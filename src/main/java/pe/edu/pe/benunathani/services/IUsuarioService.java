package pe.edu.pe.benunathani.services;

import pe.edu.pe.benunathani.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();
}
