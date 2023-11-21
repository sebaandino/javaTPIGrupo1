package com.sebaandino.tpi.Models;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
   
    @Id
    @Column(name = "dni_cliente")
    private int dni;
    @Basic
    private String nombre;
    private String apellido;
    
}
