package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSPartTimeEmployee extends PersistableExpressionImpl<PIDSPartTimeEmployee> implements PersistableExpression<PIDSPartTimeEmployee>
{
    public static final QPIDSPartTimeEmployee jdoCandidate = candidate("this");

    public static QPIDSPartTimeEmployee candidate(String name)
    {
        return new QPIDSPartTimeEmployee(null, name, 5);
    }

    public static QPIDSPartTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSPartTimeEmployee parameter(String name)
    {
        return new QPIDSPartTimeEmployee(PIDSPartTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSPartTimeEmployee variable(String name)
    {
        return new QPIDSPartTimeEmployee(PIDSPartTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSPartTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSPartTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
