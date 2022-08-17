package com.borali.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CardapioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCardapio;
    private String nome;
    private Double preco;
//    @ManyToOne
//    private ComedoriaEntity id_comedoria;

}
