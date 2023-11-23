package com.sebaandino.tpi.Models;

import com.sebaandino.tpi.Models.Categoria;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-23T20:01:15", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tecnico.class)
public class Tecnico_ { 

    public static volatile SingularAttribute<Tecnico, String> apellido;
    public static volatile SingularAttribute<Tecnico, Categoria> categoria;
    public static volatile SingularAttribute<Tecnico, Long> idTecnico;
    public static volatile SingularAttribute<Tecnico, String> nombre;

}