package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSFullTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCDSEmployee
{
    public static final QPCDSFullTimeEmployee jdoCandidate = candidate("this");

    public static QPCDSFullTimeEmployee candidate(String name)
    {
        return new QPCDSFullTimeEmployee(null, name, 5);
    }

    public static QPCDSFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSFullTimeEmployee parameter(String name)
    {
        return new QPCDSFullTimeEmployee(PCDSFullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSFullTimeEmployee variable(String name)
    {
        return new QPCDSFullTimeEmployee(PCDSFullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCDSFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
