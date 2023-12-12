package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QDentalInsurance extends org.apache.jdo.tck.pc.company.QInsurance
{
    public static final QDentalInsurance jdoCandidate = candidate("this");

    public static QDentalInsurance candidate(String name)
    {
        return new QDentalInsurance(null, name, 5);
    }

    public static QDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QDentalInsurance parameter(String name)
    {
        return new QDentalInsurance(DentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QDentalInsurance variable(String name)
    {
        return new QDentalInsurance(DentalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<java.math.BigDecimal> lifetimeOrthoBenefit;

    public QDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.lifetimeOrthoBenefit = new NumericExpressionImpl<java.math.BigDecimal>(this, "lifetimeOrthoBenefit");
    }

    public QDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.lifetimeOrthoBenefit = new NumericExpressionImpl<java.math.BigDecimal>(this, "lifetimeOrthoBenefit");
    }
}
