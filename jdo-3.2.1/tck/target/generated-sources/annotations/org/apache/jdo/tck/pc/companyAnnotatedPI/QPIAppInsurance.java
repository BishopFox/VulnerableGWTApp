package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppInsurance extends PersistableExpressionImpl<PIAppInsurance> implements PersistableExpression<PIAppInsurance>
{
    public static final QPIAppInsurance jdoCandidate = candidate("this");

    public static QPIAppInsurance candidate(String name)
    {
        return new QPIAppInsurance(null, name, 5);
    }

    public static QPIAppInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppInsurance parameter(String name)
    {
        return new QPIAppInsurance(PIAppInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppInsurance variable(String name)
    {
        return new QPIAppInsurance(PIAppInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
