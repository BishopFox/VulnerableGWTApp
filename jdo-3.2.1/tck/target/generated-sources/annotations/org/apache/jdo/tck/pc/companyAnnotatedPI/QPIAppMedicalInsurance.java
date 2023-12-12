package org.apache.jdo.tck.pc.companyAnnotatedPI;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPIAppMedicalInsurance extends PersistableExpressionImpl<PIAppMedicalInsurance> implements PersistableExpression<PIAppMedicalInsurance>
{
    public static final QPIAppMedicalInsurance jdoCandidate = candidate("this");

    public static QPIAppMedicalInsurance candidate(String name)
    {
        return new QPIAppMedicalInsurance(null, name, 5);
    }

    public static QPIAppMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QPIAppMedicalInsurance parameter(String name)
    {
        return new QPIAppMedicalInsurance(PIAppMedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QPIAppMedicalInsurance variable(String name)
    {
        return new QPIAppMedicalInsurance(PIAppMedicalInsurance.class, name, ExpressionType.VARIABLE);
    }


    public QPIAppMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
    }

    public QPIAppMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
    }
}
