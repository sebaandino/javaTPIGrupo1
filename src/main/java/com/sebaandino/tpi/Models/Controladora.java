
package com.sebaandino.tpi.Models;

import com.sebaandino.tpi.Persistencia.ControladoraPersistencia;
import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.grammars.hql.HqlParser;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public boolean altaTecnico(String nombre, String apellido,String categoria) {
        
        Tecnico tecnico = new Tecnico();
        
        tecnico.setNombre(nombre);
        tecnico.setApellido(apellido);
        tecnico.setCategoria(categoria);
        
       controlPersis.altaTecnico(tecnico);
       return true;
    }

    public void altaCliente(String nombre, String apellido,int dni) throws Exception {
        
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        
        
        controlPersis.altaCliente(cliente);
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public List<Tecnico> traerTecnicos() {
        return controlPersis.trarTecnicos();
    }

    public void altaInsidente(String descripcion, double costo, int dni, int id) {
        
        Insidente insidente = new Insidente();
        LocalDateTime fechaActual = LocalDateTime.now();
        
        
        insidente.setDescInsidente(descripcion);
        insidente.setCosto(costo);
        insidente.setEstado(false);
        insidente.setFechaInsidente(fechaActual);
        insidente.setDnicliente(dni);
        insidente.setIdTecnico(id);
        
        
        
        controlPersis.altaInsidente(insidente);
    }
    
}
