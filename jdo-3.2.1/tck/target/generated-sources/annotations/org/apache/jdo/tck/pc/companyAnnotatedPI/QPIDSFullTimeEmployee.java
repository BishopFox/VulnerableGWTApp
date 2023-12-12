package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSFullTimeEmployee extends PersistableExpressionImpl<PIDSFullTimeEmployee> implements PersistableExpression<PIDSFullTimeEmployee>
{
    public static final QPIDSFullTimeEmployee jdoCandidate = candidate("this");

    public static QPIDSFullTimeEmployee candidate(String name)
    {
        return new QPIDSFullTimeEmployee(null, name, 5);
    }

    public static QPIDSFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSFullTimeEmployee parameter(String name)
    {
        return new QPIDSFullTimeEmployee(PIDSFullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSFullTimeEmployee variable(String name)
    {
        return new QPIDSFullTimeEmployee(PIDSFullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
