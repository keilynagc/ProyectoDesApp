package com.turismo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
@Entity
@Table(name = "user_profiles")
public class UsuarioPerfil implements Serializable {

    //version de serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auser_profiles")
    private String userName;
    private String primerApellido;
    private String segundoApellido;
    private String pais;
    private String cumpleaños;
    private String direccion;
    private String telefono;

    @OneToMany
    @JoinColumn(name = "username")
    private List<Rol> roles;

}
