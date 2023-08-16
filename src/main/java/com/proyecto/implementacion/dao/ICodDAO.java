package com.proyecto.implementacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.implementacion.models.Cod;

public interface ICodDAO extends JpaRepository<Cod, Long>{

}
