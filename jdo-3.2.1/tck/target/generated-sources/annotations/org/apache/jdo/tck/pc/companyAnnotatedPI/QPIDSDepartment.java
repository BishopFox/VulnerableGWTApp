package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSDepartment extends PersistableExpressionImpl<PIDSDepartment> implements PersistableExpression<PIDSDepartment>
{
    public static final QPIDSDepartment jdoCandidate = candidate("this");

    public static QPIDSDepartment candidate(String name)
    {
        return new QPIDSDepartment(null, name, 5);
    }

    public static QPIDSDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSDepartment parameter(String name)
    {
        return new QPIDSDepartment(PIDSDepartment.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSDepartment variable(String name)
    {
        return new QPIDSDepartment(PIDSDepartment.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
