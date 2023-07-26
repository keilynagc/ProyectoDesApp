
package com.turismo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class Usuario implements Serializable{
    
    //version de serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username")
    @NotEmpty
    private String username;
    @NotEmpty
    private String passwordhash;
    private String email;
    
    
    @OneToMany
    @JoinColumn(name = "user_profiles")
    private List<Rol> roles;
}
