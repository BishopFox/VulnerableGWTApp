package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppPartTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppPerson
{
    public static final QFCAppPartTimeEmployee jdoCandidate = candidate("this");

    public static QFCAppPartTimeEmployee candidate(String name)
    {
        return new QFCAppPartTimeEmployee(null, name, 5);
    }

    public static QFCAppPartTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppPartTimeEmployee parameter(String name)
    {
        return new QFCAppPartTimeEmployee(FCAppPartTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppPartTimeEmployee variable(String name)
    {
        return new QFCAppPartTimeEmployee(FCAppPartTimeEmployee.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Double> wage;

    public QFCAppPartTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.wage = new NumericExpressionImpl<Double>(this, "wage");
    }

    public QFCAppPartTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.wage = new NumericExpressionImpl<Double>(this, "wage");
    }
}
