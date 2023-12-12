package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSInsurance extends PersistableExpressionImpl<PCDSInsurance> implements PersistableExpression<PCDSInsurance>
{
    public static final QPCDSInsurance jdoCandidate = candidate("this");

    public static QPCDSInsurance candidate(String name)
    {
        return new QPCDSInsurance(null, name, 5);
    }

    public static QPCDSInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSInsurance parameter(String name)
    {
        return new QPCDSInsurance(PCDSInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSInsurance variable(String name)
    {
        return new QPCDSInsurance(PCDSInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPCDSInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
