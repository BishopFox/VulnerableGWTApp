package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSFullTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee
{
    public static final QFCDSFullTimeEmployee jdoCandidate = candidate("this");

    public static QFCDSFullTimeEmployee candidate(String name)
    {
        return new QFCDSFullTimeEmployee(null, name, 5);
    }

    public static QFCDSFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSFullTimeEmployee parameter(String name)
    {
        return new QFCDSFullTimeEmployee(FCDSFullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSFullTimeEmployee variable(String name)
    {
        return new QFCDSFullTimeEmployee(FCDSFullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Double> salary;

    public QFCDSFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.salary = new NumericExpressionImpl<Double>(this, "salary");
    }

    public QFCDSFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.salary = new NumericExpressionImpl<Double>(this, "salary");
    }
}
