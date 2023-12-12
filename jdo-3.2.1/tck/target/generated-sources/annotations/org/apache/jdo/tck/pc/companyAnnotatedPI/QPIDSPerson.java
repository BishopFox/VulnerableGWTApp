package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSPerson extends PersistableExpressionImpl<PIDSPerson> implements PersistableExpression<PIDSPerson>
{
    public static final QPIDSPerson jdoCandidate = candidate("this");

    public static QPIDSPerson candidate(String name)
    {
        return new QPIDSPerson(null, name, 5);
    }

    public static QPIDSPerson candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSPerson parameter(String name)
    {
        return new QPIDSPerson(PIDSPerson.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSPerson variable(String name)
    {
        return new QPIDSPerson(PIDSPerson.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
