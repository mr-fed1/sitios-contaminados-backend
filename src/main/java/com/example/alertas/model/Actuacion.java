
package com.example.alertas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "actuacion")
public class Actuacion {
    @Id
    private String id;

    private Integer idtipo_actuacion;
    private Integer nroact;
    private Integer idreparticion;
    private Integer ano;
    private Integer idestado_actuacion;
    private String generadoreventual;
    private String otros;
    private String laboratorio;
    private String actividad;
    private String observaciones;
    private Date fecha_entrada;
    private String cuit;
    private String responsable;
    private String usuario;
    private Date fechaupdate;
    private String habilitado;
    private String finalizado;
}
