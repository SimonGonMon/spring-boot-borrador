package com.proyecto.implementacion.services;

import com.proyecto.implementacion.dao.ICodDAO;
import com.proyecto.implementacion.models.Cod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodService implements ICodService {

    @Autowired
    private ICodDAO codDAO;

    @Override
    public List<Cod> findAll() {
        return codDAO.findAll();
    }

    @Override
    public Cod findById(Long id) {
        return codDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        codDAO.deleteById(id);
    }

    @Override
    public Cod save(Cod cod) {
        return codDAO.save(cod);
    }
}
