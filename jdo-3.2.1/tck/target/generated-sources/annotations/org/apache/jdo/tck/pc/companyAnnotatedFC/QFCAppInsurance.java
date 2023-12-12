package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppInsurance extends PersistableExpressionImpl<FCAppInsurance> implements PersistableExpression<FCAppInsurance>
{
    public static final QFCAppInsurance jdoCandidate = candidate("this");

    public static QFCAppInsurance candidate(String name)
    {
        return new QFCAppInsurance(null, name, 5);
    }

    public static QFCAppInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppInsurance parameter(String name)
    {
        return new QFCAppInsurance(FCAppInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppInsurance variable(String name)
    {
        return new QFCAppInsurance(FCAppInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> insid;
    public final StringExpression carrier;
    public final ObjectExpression<org.apache.jdo.tck.pc.companyAnnotatedFC.FCAppEmployee> employee;

    public QFCAppInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.insid = new NumericExpressionImpl<Long>(this, "insid");
        this.carrier = new StringExpressionImpl(this, "carrier");
        this.employee = new ObjectExpressionImpl<org.apache.jdo.tck.pc.companyAnnotatedFC.FCAppEmployee>(this, "employee");
    }

    public QFCAppInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.insid = new NumericExpressionImpl<Long>(this, "insid");
        this.carrier = new StringExpressionImpl(this, "carrier");
        this.employee = new ObjectExpressionImpl<org.apache.jdo.tck.pc.companyAnnotatedFC.FCAppEmployee>(this, "employee");
    }
}
