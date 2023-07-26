
package com.turismo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "Support")
public class Soporte implements Serializable{
    
    //version de serializacion
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="ticket_number")
    private Long numeroTicket;
    private String nombre;
    private String email;
    private String mensajeDescripcion;
    private String estado;

    public Soporte() {
    }

    public Soporte(String nombre, String email, String mensajeDescripcion, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.mensajeDescripcion = mensajeDescripcion;
        this.estado = estado;
    }
    
    
}
