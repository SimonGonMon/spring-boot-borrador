package com.proyecto.implementacion.controllers;

import com.proyecto.implementacion.models.Anime;
import com.proyecto.implementacion.models.Cod;
import com.proyecto.implementacion.services.ICodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cod")
public class CodController {
    @Autowired
    private ICodService codService;

    static List<Anime> lista = new ArrayList<>();

    @GetMapping("/api")
    public String saludo() {
        return "Muerte a Gustavo Petro";
    }

    @GetMapping("/lista")
    public List<Cod> listarCod() {
        return codService.findAll();
    }

    @GetMapping("/lista/{id}")
    public Cod verCod(@PathVariable Long id) {
        return codService.findById(id);
    }

    @PostMapping("/crear")
    public List<Cod> crearCod(@RequestBody Cod cod) {
        codService.save(cod);
        return codService.findAll();
    }

    @PutMapping("/actualizar/{id}")
    public Cod actualizarCod(@PathVariable Long id, @RequestBody Cod cod) {
        Cod actual = codService.findById(id);
        if (actual != null) {
            actual.setNombre(cod.getNombre());
            actual.setCalifacion(cod.getCalifacion());
            actual.setPrecio(cod.getPrecio());
            actual.setDesarrollador(cod.getDesarrollador());
        }
        return codService.save(actual);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarCod(@PathVariable Long id) {
        codService.delete(id);
    }


}
