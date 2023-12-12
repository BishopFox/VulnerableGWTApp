package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSPartTimeEmployee extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee
{
    public static final QFCDSPartTimeEmployee jdoCandidate = candidate("this");

    public static QFCDSPartTimeEmployee candidate(String name)
    {
        return new QFCDSPartTimeEmployee(null, name, 5);
    }

    public static QFCDSPartTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSPartTimeEmployee parameter(String name)
    {
        return new QFCDSPartTimeEmployee(FCDSPartTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSPartTimeEmployee variable(String name)
    {
        return new QFCDSPartTimeEmployee(FCDSPartTimeEmployee.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Double> wage;

    public QFCDSPartTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.wage = new NumericExpressionImpl<Double>(this, "wage");
    }

    public QFCDSPartTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.wage = new NumericExpressionImpl<Double>(this, "wage");
    }
}
