package com.sebaandino.tpi.Models;

import com.sebaandino.tpi.Models.Cliente;
import com.sebaandino.tpi.Models.Tecnico;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-23T15:20:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Insidente.class)
public class Insidente_ { 

    public static volatile SingularAttribute<Insidente, Boolean> estado;
    public static volatile SingularAttribute<Insidente, String> descInsidente;
    public static volatile SingularAttribute<Insidente, Double> costo;
    public static volatile SingularAttribute<Insidente, LocalDateTime> fechaInsidente;
    public static volatile SingularAttribute<Insidente, Cliente> dniCliente;
    public static volatile SingularAttribute<Insidente, Tecnico> idTecnico;
    public static volatile SingularAttribute<Insidente, Long> id_insidente;

}