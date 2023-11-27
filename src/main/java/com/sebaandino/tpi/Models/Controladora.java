
package com.sebaandino.tpi.Models;

import com.sebaandino.tpi.Persistencia.ControladoraPersistencia;
import java.time.LocalDateTime;
import java.util.List;


//Matix: Por algun motivo esta clase me macra error, pero no me dice dónde
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public boolean altaTecnico(String nombre, String apellido, String categoria) {
        
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
    public boolean verificarTecnico(String nombre, String apellido){
        List<Tecnico> tecnicos = this.traerTecnicos();
        for(Tecnico t : tecnicos){
            
            if(t.getApellido().equalsIgnoreCase(apellido) && t.getNombre().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
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

    public void EliminarTecnico(int idTecnico) {
        
        controlPersis.EliminarTecnico(idTecnico);
    }
    public void eliminarCliente(int idCliente) {
        
        controlPersis.eliminarCliente(idCliente);
    }
    public void eliminarCategoria(Long idCategoria) {
        controlPersis.eliminarCategoria(idCategoria);
    }
    public void eliminarInsidente(Long idInsidente){
        controlPersis.eliminarInsdiente(idInsidente);
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

    public Tecnico traerTecnico(int id) {
       return controlPersis.traerTecnico(id);
    }

    public Categoria traerCategoria(Long idCategoria) {
        return controlPersis.traerCategoria(idCategoria);
    }

    public boolean altaCategoria(String tipoCategoria) {
        Categoria categoria = new Categoria();
        categoria.setTipoCategoria(tipoCategoria);
        controlPersis.altaCategoria(categoria);
        return true;
    }
    
    public boolean verificarCategoria(String tipoCategoria){
        List<Categoria> categorias = this.traerCaterorias();
        for(Categoria c : categorias){
            if(c.getTipoCategoria().equalsIgnoreCase(tipoCategoria))
                return true;
        }
        return false;
    }
    
    public List<Categoria> traerCaterorias() {
        return controlPersis.traerCategorias();
    }
    
    public List<Insidente> traerInsidentes(){
        return controlPersis.PersistraerInsidentes();
    }
    


    public void editarCliente(Cliente c, int dni, String nombre, String apellido) {
        c.setDni(dni);
        c.setNombre(nombre);
        c.setApellido(apellido);
        controlPersis.editarCliente(c);
    }

    public void editarTecnico(Tecnico t, String nombre, String apellido, String categoria) {
        t.setNombre(nombre);
        t.setApellido(apellido);
        t.setCategoria(categoria);
        controlPersis.editarTecnico(t);
    }


    
}
