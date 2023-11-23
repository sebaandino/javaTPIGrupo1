
package com.sebaandino.tpi.Models;

import com.sebaandino.tpi.Persistencia.ControladoraPersistencia;
import java.time.LocalDateTime;
import java.util.List;



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

    public boolean altaCliente(String nombre, String apellido, int dni) throws Exception {
        
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        
        
        controlPersis.altaCliente(cliente);
        return true;
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public List<Tecnico> traerTecnicos() {
        return controlPersis.trarTecnicos();
    }

    public void altaInsidente(String descripcion, double costo, Cliente cliente, Tecnico tecnico ){
        
        Insidente insidente = new Insidente();
        LocalDateTime fechaActual = LocalDateTime.now();
        
        
        insidente.setDescInsidente(descripcion);
        insidente.setCosto(costo);
        insidente.setEstado(false);
        insidente.setFechaInsidente(fechaActual);
        insidente.setIdTecnico(tecnico);
        insidente.setDniCliente(cliente);
        
        controlPersis.altaInsidente(insidente);
    }

    public void EliminarTecnico(Long idTecnico) {
        
        controlPersis.EliminarTecnico(idTecnico);
    }
    public void eliminarCliente(int idCliente) {
        
        controlPersis.eliminarCliente(idCliente);
    }

    public Cliente traeCliente(int dniCliente) {
        return controlPersis.traerCliente(dniCliente);
    }

    public List<Insidente> traerInsidentes(int dniCliente) {
        
        List<Insidente> listaInsidentes = controlPersis.traerInsidentes();
        
        List<Insidente> listaInsidentesFiltrada = listaInsidentes.stream()
            .filter(insidente -> insidente.getDniCliente().getDni()== dniCliente).toList();
        
        return listaInsidentesFiltrada;
        
    }

    public Tecnico traerTecnico(Long id) {
       return controlPersis.traerTecnico(id);
    }
    


    public void editarCliente(Cliente c, int dni, String nombre, String apellido) {
        
        c.setDni(dni);
        c.setNombre(nombre);
        c.setApellido(apellido);
        
        controlPersis.editarCliente(c);
        
    }
    
}
