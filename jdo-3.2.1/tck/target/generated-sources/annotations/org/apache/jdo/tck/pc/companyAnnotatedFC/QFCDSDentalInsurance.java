package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSDentalInsurance extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSInsurance
{
    public static final QFCDSDentalInsurance jdoCandidate = candidate("this");

    public static QFCDSDentalInsurance candidate(String name)
    {
        return new QFCDSDentalInsurance(null, name, 5);
    }

    public static QFCDSDentalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSDentalInsurance parameter(String name)
    {
        return new QFCDSDentalInsurance(FCDSDentalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSDentalInsurance variable(String name)
    {
        return new QFCDSDentalInsurance(FCDSDentalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<java.math.BigDecimal> lifetimeOrthoBenefit;

    public QFCDSDentalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.lifetimeOrthoBenefit = new NumericExpressionImpl<java.math.BigDecimal>(this, "lifetimeOrthoBenefit");
    }

    public QFCDSDentalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.lifetimeOrthoBenefit = new NumericExpressionImpl<java.math.BigDecimal>(this, "lifetimeOrthoBenefit");
    }
}
