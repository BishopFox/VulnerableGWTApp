package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppEmployee extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCAppPerson
{
    public static final QPCAppEmployee jdoCandidate = candidate("this");

    public static QPCAppEmployee candidate(String name)
    {
        return new QPCAppEmployee(null, name, 5);
    }

    public static QPCAppEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppEmployee parameter(String name)
    {
        return new QPCAppEmployee(PCAppEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppEmployee variable(String name)
    {
        return new QPCAppEmployee(PCAppEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCAppEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
