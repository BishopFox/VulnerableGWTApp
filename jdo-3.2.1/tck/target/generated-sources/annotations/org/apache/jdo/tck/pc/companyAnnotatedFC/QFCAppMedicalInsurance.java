package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppMedicalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppInsurance
{
    public static final QFCAppMedicalInsurance jdoCandidate = candidate("this");

    public static QFCAppMedicalInsurance candidate(String name)
    {
        return new QFCAppMedicalInsurance(null, name, 5);
    }

    public static QFCAppMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppMedicalInsurance parameter(String name)
    {
        return new QFCAppMedicalInsurance(FCAppMedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppMedicalInsurance variable(String name)
    {
        return new QFCAppMedicalInsurance(FCAppMedicalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression planType;

    public QFCAppMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.planType = new StringExpressionImpl(this, "planType");
    }

    public QFCAppMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.planType = new StringExpressionImpl(this, "planType");
    }
}
