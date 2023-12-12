package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSMedicalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedPC.QPCDSInsurance
{
    public static final QPCDSMedicalInsurance jdoCandidate = candidate("this");

    public static QPCDSMedicalInsurance candidate(String name)
    {
        return new QPCDSMedicalInsurance(null, name, 5);
    }

    public static QPCDSMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSMedicalInsurance parameter(String name)
    {
        return new QPCDSMedicalInsurance(PCDSMedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSMedicalInsurance variable(String name)
    {
        return new QPCDSMedicalInsurance(PCDSMedicalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPCDSMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
    }

    public QPCDSMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
