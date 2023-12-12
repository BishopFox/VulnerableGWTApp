package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSEmployee extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCDSPerson
{
    public static final QPCDSEmployee jdoCandidate = candidate("this");

    public static QPCDSEmployee candidate(String name)
    {
        return new QPCDSEmployee(null, name, 5);
    }

    public static QPCDSEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSEmployee parameter(String name)
    {
        return new QPCDSEmployee(PCDSEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSEmployee variable(String name)
    {
        return new QPCDSEmployee(PCDSEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCDSEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
