package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-13T14:59:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Utilizador.class)
public class Utilizador_ { 

    public static volatile SingularAttribute<Utilizador, String> nome;
    public static volatile SingularAttribute<Utilizador, Integer> id;
    public static volatile SingularAttribute<Utilizador, String> psswd;
    public static volatile SingularAttribute<Utilizador, String> email;

}