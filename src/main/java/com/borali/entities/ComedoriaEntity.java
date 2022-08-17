package com.borali.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ComedoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComedoria;
    private String nome;
    private Integer contato;

}
