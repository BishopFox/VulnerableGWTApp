package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSAddress extends PersistableExpressionImpl<PIDSAddress> implements PersistableExpression<PIDSAddress>
{
    public static final QPIDSAddress jdoCandidate = candidate("this");

    public static QPIDSAddress candidate(String name)
    {
        return new QPIDSAddress(null, name, 5);
    }

    public static QPIDSAddress candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSAddress parameter(String name)
    {
        return new QPIDSAddress(PIDSAddress.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSAddress variable(String name)
    {
        return new QPIDSAddress(PIDSAddress.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSAddress(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSAddress(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
