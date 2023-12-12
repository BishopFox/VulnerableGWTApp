package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSInsurance extends PersistableExpressionImpl<FCDSInsurance> implements PersistableExpression<FCDSInsurance>
{
    public static final QFCDSInsurance jdoCandidate = candidate("this");

    public static QFCDSInsurance candidate(String name)
    {
        return new QFCDSInsurance(null, name, 5);
    }

    public static QFCDSInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSInsurance parameter(String name)
    {
        return new QFCDSInsurance(FCDSInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSInsurance variable(String name)
    {
        return new QFCDSInsurance(FCDSInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> insid;
    public final StringExpression carrier;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee employee;

    public QFCDSInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.insid = new NumericExpressionImpl<Long>(this, "insid");
        this.carrier = new StringExpressionImpl(this, "carrier");
        if (depth > 0)
        {
            this.employee = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "employee", depth-1);
        }
        else
        {
            this.employee = null;
        }
    }

    public QFCDSInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.insid = new NumericExpressionImpl<Long>(this, "insid");
        this.carrier = new StringExpressionImpl(this, "carrier");
        this.employee = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "employee", 5);
    }
}
