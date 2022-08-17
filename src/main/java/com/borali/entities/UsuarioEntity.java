package com.borali.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String contato;
    private String email;
    private String senha;

}
