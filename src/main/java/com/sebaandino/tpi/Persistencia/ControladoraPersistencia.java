package com.sebaandino.tpi.Persistencia;

import com.sebaandino.tpi.Models.Categoria;
import com.sebaandino.tpi.Models.Cliente;
import com.sebaandino.tpi.Models.Insidente;
import com.sebaandino.tpi.Models.Tecnico;
import com.sebaandino.tpi.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    TecnicoJpaController tecnicoJpa = new TecnicoJpaController();
    InsidenteJpaController insidenteJpa = new InsidenteJpaController();
    CategoriaJpaController catJpa = new CategoriaJpaController();

    public void altaTecnico(Tecnico tecnico) {
        tecnicoJpa.create(tecnico);
        
    }

    public void altaCliente(Cliente cliente) throws Exception{
        clienteJpa.create(cliente);
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public List<Tecnico> trarTecnicos() {
        return tecnicoJpa.findTecnicoEntities();
    }

    public void altaInsidente(Insidente insidente) {
        insidenteJpa.create(insidente);
    }

    public void EliminarTecnico(Long idTecnico) {
        try {
            tecnicoJpa.destroy(idTecnico);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCliente(int idCliente) {
        try {
            clienteJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(int dniCliente) {
      return clienteJpa.findCliente(dniCliente);
    }

    public List<Insidente> traerInsidentes() {
        return insidenteJpa.findInsidenteEntities();
    }

    public Tecnico traerTecnico(Long id) {
        return tecnicoJpa.findTecnico(id);
    }

    public Categoria traerCategoria(Long idCategoria) {
        return catJpa.findCategoria(idCategoria);
    }

    public void altaCategoria(Categoria categoria) {
        catJpa.create(categoria);
    }

    public List<Categoria> traerCategorias() {
        return catJpa.findCategoriaEntities();
    }
    
    


    public void editarCliente(Cliente c) {
        try {
            clienteJpa.edit(c);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
}
