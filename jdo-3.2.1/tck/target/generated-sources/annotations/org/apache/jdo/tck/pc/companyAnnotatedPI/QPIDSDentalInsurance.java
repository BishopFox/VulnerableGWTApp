package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSDentalInsurance extends PersistableExpressionImpl<PIDSDentalInsurance> implements PersistableExpression<PIDSDentalInsurance>
{
    public static final QPIDSDentalInsurance jdoCandidate = candidate("this");

    public static QPIDSDentalInsurance candidate(String name)
    {
        return new QPIDSDentalInsurance(null, name, 5);
    }

    public static QPIDSDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSDentalInsurance parameter(String name)
    {
        return new QPIDSDentalInsurance(PIDSDentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSDentalInsurance variable(String name)
    {
        return new QPIDSDentalInsurance(PIDSDentalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
