package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppAddress extends PersistableExpressionImpl<PIAppAddress> implements PersistableExpression<PIAppAddress>
{
    public static final QPIAppAddress jdoCandidate = candidate("this");

    public static QPIAppAddress candidate(String name)
    {
        return new QPIAppAddress(null, name, 5);
    }

    public static QPIAppAddress candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppAddress parameter(String name)
    {
        return new QPIAppAddress(PIAppAddress.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppAddress variable(String name)
    {
        return new QPIAppAddress(PIAppAddress.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppAddress(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppAddress(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
