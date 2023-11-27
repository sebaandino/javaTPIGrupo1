package com.sebaandino.tpi.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @Temporal(TemporalType.DATE)
    private Date fechaInsidente;
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "dni_cliente_insidente")
    private Cliente dniCliente;
    @ManyToOne
    @JoinColumn(name = "id_tecnico_insidente")
    private Tecnico idTecnico;
  
   
}
