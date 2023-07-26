package com.turismo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "region")
public class Region implements Serializable {

    //Versión de serialización
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_name")
    private String region_Name;
    private String caracteristicas;
    private String actividadesPopulares;
    private String datosCuriosos;
    private String hoteles;
    private String linkHotel;

    @OneToMany
    @JoinColumn(name = "activity_id")
    private List<Actividad> actividades;

    public Region() {
    }

    public Region(String caracteristicas, String actividadesPopulares, String datosCuriosos, String hoteles, String linkHotel) {
        this.caracteristicas = caracteristicas;
        this.actividadesPopulares = actividadesPopulares;
        this.datosCuriosos = datosCuriosos;
        this.hoteles = hoteles;
        this.linkHotel = linkHotel;
    }

}
