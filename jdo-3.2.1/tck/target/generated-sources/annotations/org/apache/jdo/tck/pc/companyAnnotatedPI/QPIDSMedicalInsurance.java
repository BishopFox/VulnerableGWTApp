package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIDSMedicalInsurance extends PersistableExpressionImpl<PIDSMedicalInsurance> implements PersistableExpression<PIDSMedicalInsurance>
{
    public static final QPIDSMedicalInsurance jdoCandidate = candidate("this");

    public static QPIDSMedicalInsurance candidate(String name)
    {
        return new QPIDSMedicalInsurance(null, name, 5);
    }

    public static QPIDSMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPIDSMedicalInsurance parameter(String name)
    {
        return new QPIDSMedicalInsurance(PIDSMedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPIDSMedicalInsurance variable(String name)
    {
        return new QPIDSMedicalInsurance(PIDSMedicalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPIDSMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIDSMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
