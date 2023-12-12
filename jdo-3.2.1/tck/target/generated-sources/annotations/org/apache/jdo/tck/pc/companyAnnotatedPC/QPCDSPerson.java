package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSPerson extends PersistableExpressionImpl<PCDSPerson> implements PersistableExpression<PCDSPerson>
{
    public static final QPCDSPerson jdoCandidate = candidate("this");

    public static QPCDSPerson candidate(String name)
    {
        return new QPCDSPerson(null, name, 5);
    }

    public static QPCDSPerson candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSPerson parameter(String name)
    {
        return new QPCDSPerson(PCDSPerson.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSPerson variable(String name)
    {
        return new QPCDSPerson(PCDSPerson.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCDSPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
