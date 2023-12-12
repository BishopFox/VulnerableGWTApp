package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppPerson extends PersistableExpressionImpl<PCAppPerson> implements PersistableExpression<PCAppPerson>
{
    public static final QPCAppPerson jdoCandidate = candidate("this");

    public static QPCAppPerson candidate(String name)
    {
        return new QPCAppPerson(null, name, 5);
    }

    public static QPCAppPerson candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppPerson parameter(String name)
    {
        return new QPCAppPerson(PCAppPerson.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppPerson variable(String name)
    {
        return new QPCAppPerson(PCAppPerson.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppPerson(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCAppPerson(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
