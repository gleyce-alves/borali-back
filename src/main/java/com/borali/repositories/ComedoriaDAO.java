package com.borali.repositories;

import com.borali.entities.ComedoriaEntity;
import com.borali.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComedoriaDAO extends JpaRepository<ComedoriaEntity, Integer> {



}
