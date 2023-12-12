package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppMedicalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCAppInsurance
{
    public static final QPCAppMedicalInsurance jdoCandidate = candidate("this");

    public static QPCAppMedicalInsurance candidate(String name)
    {
        return new QPCAppMedicalInsurance(null, name, 5);
    }

    public static QPCAppMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppMedicalInsurance parameter(String name)
    {
        return new QPCAppMedicalInsurance(PCAppMedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppMedicalInsurance variable(String name)
    {
        return new QPCAppMedicalInsurance(PCAppMedicalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPCAppMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCAppMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
