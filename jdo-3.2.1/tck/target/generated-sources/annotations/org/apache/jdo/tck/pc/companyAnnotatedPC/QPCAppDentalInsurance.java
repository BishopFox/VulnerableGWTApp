package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppDentalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCAppInsurance
{
    public static final QPCAppDentalInsurance jdoCandidate = candidate("this");

    public static QPCAppDentalInsurance candidate(String name)
    {
        return new QPCAppDentalInsurance(null, name, 5);
    }

    public static QPCAppDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppDentalInsurance parameter(String name)
    {
        return new QPCAppDentalInsurance(PCAppDentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppDentalInsurance variable(String name)
    {
        return new QPCAppDentalInsurance(PCAppDentalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCAppDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
