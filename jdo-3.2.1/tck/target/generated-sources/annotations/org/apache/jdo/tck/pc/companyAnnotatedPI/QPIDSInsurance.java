package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSInsurance extends PersistableExpressionImpl<PIDSInsurance> implements PersistableExpression<PIDSInsurance>
{
    public static final QPIDSInsurance jdoCandidate = candidate("this");

    public static QPIDSInsurance candidate(String name)
    {
        return new QPIDSInsurance(null, name, 5);
    }

    public static QPIDSInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSInsurance parameter(String name)
    {
        return new QPIDSInsurance(PIDSInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSInsurance variable(String name)
    {
        return new QPIDSInsurance(PIDSInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
