package com.sebaandino.tpi.Persistencia;

import com.sebaandino.tpi.Models.Cliente;
import com.sebaandino.tpi.Models.Insidente;
import com.sebaandino.tpi.Models.Tecnico;
import java.util.List;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    TecnicoJpaController tecnicoJpa = new TecnicoJpaController();
    InsidenteJpaController insidenteJpa = new InsidenteJpaController();

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
    
    
    
}
