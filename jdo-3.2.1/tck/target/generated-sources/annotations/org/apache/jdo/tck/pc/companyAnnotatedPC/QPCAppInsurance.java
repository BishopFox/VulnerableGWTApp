package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppInsurance extends PersistableExpressionImpl<PCAppInsurance> implements PersistableExpression<PCAppInsurance>
{
    public static final QPCAppInsurance jdoCandidate = candidate("this");

    public static QPCAppInsurance candidate(String name)
    {
        return new QPCAppInsurance(null, name, 5);
    }

    public static QPCAppInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppInsurance parameter(String name)
    {
        return new QPCAppInsurance(PCAppInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppInsurance variable(String name)
    {
        return new QPCAppInsurance(PCAppInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCAppInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
