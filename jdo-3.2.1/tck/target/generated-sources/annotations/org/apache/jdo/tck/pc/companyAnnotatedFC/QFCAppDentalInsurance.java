package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppDentalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppInsurance
{
    public static final QFCAppDentalInsurance jdoCandidate = candidate("this");

    public static QFCAppDentalInsurance candidate(String name)
    {
        return new QFCAppDentalInsurance(null, name, 5);
    }

    public static QFCAppDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppDentalInsurance parameter(String name)
    {
        return new QFCAppDentalInsurance(FCAppDentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppDentalInsurance variable(String name)
    {
        return new QFCAppDentalInsurance(FCAppDentalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<java.math.BigDecimal> lifetimeOrthoBenefit;

    public QFCAppDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.lifetimeOrthoBenefit = new NumericExpressionImpl<java.math.BigDecimal>(this, "lifetimeOrthoBenefit");
    }

    public QFCAppDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.lifetimeOrthoBenefit = new NumericExpressionImpl<java.math.BigDecimal>(this, "lifetimeOrthoBenefit");
    }
}
