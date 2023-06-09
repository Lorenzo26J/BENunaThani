package pe.edu.pe.benunathani.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.dtos.UsuarioDTO;
import pe.edu.pe.benunathani.entities.Usuario;
import pe.edu.pe.benunathani.services.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @PostMapping
    public void insert(@RequestBody UsuarioDTO dto){
        ModelMapper m= new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }
    @GetMapping
    public List<UsuarioDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
