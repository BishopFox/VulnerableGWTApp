package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSPartTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCDSEmployee
{
    public static final QPCDSPartTimeEmployee jdoCandidate = candidate("this");

    public static QPCDSPartTimeEmployee candidate(String name)
    {
        return new QPCDSPartTimeEmployee(null, name, 5);
    }

    public static QPCDSPartTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSPartTimeEmployee parameter(String name)
    {
        return new QPCDSPartTimeEmployee(PCDSPartTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSPartTimeEmployee variable(String name)
    {
        return new QPCDSPartTimeEmployee(PCDSPartTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSPartTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCDSPartTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
