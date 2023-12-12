package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppFullTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCAppEmployee
{
    public static final QPCAppFullTimeEmployee jdoCandidate = candidate("this");

    public static QPCAppFullTimeEmployee candidate(String name)
    {
        return new QPCAppFullTimeEmployee(null, name, 5);
    }

    public static QPCAppFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppFullTimeEmployee parameter(String name)
    {
        return new QPCAppFullTimeEmployee(PCAppFullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppFullTimeEmployee variable(String name)
    {
        return new QPCAppFullTimeEmployee(PCAppFullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCAppFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
