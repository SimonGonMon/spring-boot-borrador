package com.proyecto.implementacion.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.implementacion.models.Anime;
public interface IAnimeDAO extends JpaRepository<Anime,Long>{

}