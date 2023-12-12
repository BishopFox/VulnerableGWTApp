package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSEmployee extends PersistableExpressionImpl<PIDSEmployee> implements PersistableExpression<PIDSEmployee>
{
    public static final QPIDSEmployee jdoCandidate = candidate("this");

    public static QPIDSEmployee candidate(String name)
    {
        return new QPIDSEmployee(null, name, 5);
    }

    public static QPIDSEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSEmployee parameter(String name)
    {
        return new QPIDSEmployee(PIDSEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSEmployee variable(String name)
    {
        return new QPIDSEmployee(PIDSEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
