package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppDentalInsurance extends PersistableExpressionImpl<PIAppDentalInsurance> implements PersistableExpression<PIAppDentalInsurance>
{
    public static final QPIAppDentalInsurance jdoCandidate = candidate("this");

    public static QPIAppDentalInsurance candidate(String name)
    {
        return new QPIAppDentalInsurance(null, name, 5);
    }

    public static QPIAppDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppDentalInsurance parameter(String name)
    {
        return new QPIAppDentalInsurance(PIAppDentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppDentalInsurance variable(String name)
    {
        return new QPIAppDentalInsurance(PIAppDentalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
