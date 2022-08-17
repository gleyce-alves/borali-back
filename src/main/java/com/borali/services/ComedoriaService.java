package com.borali.services;

import com.borali.entities.ComedoriaEntity;
import com.borali.repositories.ComedoriaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComedoriaService {

    @Autowired
    private ComedoriaDAO comedoriaDAO;

    public List<ComedoriaEntity> listaComedoria(){
        return (List<ComedoriaEntity>) comedoriaDAO.findAll();
    }

}
