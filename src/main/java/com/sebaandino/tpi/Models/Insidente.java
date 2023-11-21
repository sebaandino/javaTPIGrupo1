package com.sebaandino.tpi.Models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="insidente")
public class Insidente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_insidente")
    private Long id_insidente;
    private String descInsidente;
    private double costo;
    @Column(name = "fecha_incidente")
    private LocalDateTime fechaInsidente;
    private boolean estado;
    private int dnicliente;
    private int idTecnico;
  
   
}
