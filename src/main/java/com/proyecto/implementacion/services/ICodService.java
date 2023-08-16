package com.proyecto.implementacion.services;

import com.proyecto.implementacion.models.Cod;
import java.util.List;

public interface ICodService {
    public List<Cod> findAll();
    public Cod findById(Long id);
    public void delete(Long id);
    public Cod save (Cod cod);
}
