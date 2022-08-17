package com.borali.services;

import com.borali.entities.ComedoriaEntity;
import com.borali.repositories.ComedoriaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComedoriaService {

    @Autowired
    private ComedoriaDAO comedoriaDAO;

    public List<ComedoriaEntity> listaComedoria() {
        return (List<ComedoriaEntity>) comedoriaDAO.findAll();
    }

//    public Optional<ComedoriaEntity> findByNome(String nome) {
//        return this.comedoriaDAO.findByNome(nome);
//    }

    public void save(ComedoriaEntity comedoria) {
        this.comedoriaDAO.save(comedoria);
    }
}