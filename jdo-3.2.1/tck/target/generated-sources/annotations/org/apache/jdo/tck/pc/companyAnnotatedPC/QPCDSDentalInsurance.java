package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSDentalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCDSInsurance
{
    public static final QPCDSDentalInsurance jdoCandidate = candidate("this");

    public static QPCDSDentalInsurance candidate(String name)
    {
        return new QPCDSDentalInsurance(null, name, 5);
    }

    public static QPCDSDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSDentalInsurance parameter(String name)
    {
        return new QPCDSDentalInsurance(PCDSDentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSDentalInsurance variable(String name)
    {
        return new QPCDSDentalInsurance(PCDSDentalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCDSDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
