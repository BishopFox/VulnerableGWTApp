package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppPartTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCAppEmployee
{
    public static final QPCAppPartTimeEmployee jdoCandidate = candidate("this");

    public static QPCAppPartTimeEmployee candidate(String name)
    {
        return new QPCAppPartTimeEmployee(null, name, 5);
    }

    public static QPCAppPartTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppPartTimeEmployee parameter(String name)
    {
        return new QPCAppPartTimeEmployee(PCAppPartTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppPartTimeEmployee variable(String name)
    {
        return new QPCAppPartTimeEmployee(PCAppPartTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppPartTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCAppPartTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
