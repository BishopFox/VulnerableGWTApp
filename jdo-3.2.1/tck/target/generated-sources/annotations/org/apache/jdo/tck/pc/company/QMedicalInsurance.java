package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QMedicalInsurance extends org.apache.jdo.tck.pc.company.QInsurance
{
    public static final QMedicalInsurance jdoCandidate = candidate("this");

    public static QMedicalInsurance candidate(String name)
    {
        return new QMedicalInsurance(null, name, 5);
    }

    public static QMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QMedicalInsurance parameter(String name)
    {
        return new QMedicalInsurance(MedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QMedicalInsurance variable(String name)
    {
        return new QMedicalInsurance(MedicalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression planType;

    public QMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.planType = new StringExpressionImpl(this, "planType");
    }

    public QMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.planType = new StringExpressionImpl(this, "planType");
    }
}
