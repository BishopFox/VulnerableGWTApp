package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSMedicalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSInsurance
{
    public static final QFCDSMedicalInsurance jdoCandidate = candidate("this");

    public static QFCDSMedicalInsurance candidate(String name)
    {
        return new QFCDSMedicalInsurance(null, name, 5);
    }

    public static QFCDSMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSMedicalInsurance parameter(String name)
    {
        return new QFCDSMedicalInsurance(FCDSMedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSMedicalInsurance variable(String name)
    {
        return new QFCDSMedicalInsurance(FCDSMedicalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression planType;

    public QFCDSMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.planType = new StringExpressionImpl(this, "planType");
    }

    public QFCDSMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.planType = new StringExpressionImpl(this, "planType");
    }
}
