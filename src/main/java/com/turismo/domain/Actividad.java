
package com.turismo.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name="Activities")
public class Actividad implements Serializable{
    
    //version de serializacion
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="activity_id")
    private Long idActivity;
    private String regionName;
    private String aventuraNombre;
    private String aventuraDescripcion;
    private String horario;
    private String atracciones;
    private String review;
    private String comentarios;
    private String recomendaciones;

    public Actividad() {
    }

    public Actividad(String regionName, String aventuraNombre, String aventuraDescripcion, String horario, String atracciones, String review, String comentarios, String recomendaciones) {
        this.regionName = regionName;
        this.aventuraNombre = aventuraNombre;
        this.aventuraDescripcion = aventuraDescripcion;
        this.horario = horario;
        this.atracciones = atracciones;
        this.review = review;
        this.comentarios = comentarios;
        this.recomendaciones = recomendaciones;
    }
    
    
    
}
