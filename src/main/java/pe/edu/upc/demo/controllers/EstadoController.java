package pe.edu.upc.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo.dtos.EstadoDTO;
import pe.edu.upc.demo.entities.Estado;
import pe.edu.upc.demo.services.IEstadoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping( "/estados")
public class EstadoController {
    @Autowired
    private IEstadoService eS;
    @PostMapping
    public void insert (@RequestBody EstadoDTO dto){
        ModelMapper m=new ModelMapper();
        Estado e=m.map(dto,Estado.class);
        eS.insert(e);
    }
    @GetMapping
    public List<EstadoDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstadoDTO.class);
        }).collect(Collectors.toList());
    }


}
