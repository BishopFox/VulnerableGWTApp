package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppFullTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppPerson
{
    public static final QFCAppFullTimeEmployee jdoCandidate = candidate("this");

    public static QFCAppFullTimeEmployee candidate(String name)
    {
        return new QFCAppFullTimeEmployee(null, name, 5);
    }

    public static QFCAppFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppFullTimeEmployee parameter(String name)
    {
        return new QFCAppFullTimeEmployee(FCAppFullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppFullTimeEmployee variable(String name)
    {
        return new QFCAppFullTimeEmployee(FCAppFullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Double> salary;

    public QFCAppFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.salary = new NumericExpressionImpl<Double>(this, "salary");
    }

    public QFCAppFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.salary = new NumericExpressionImpl<Double>(this, "salary");
    }
}
