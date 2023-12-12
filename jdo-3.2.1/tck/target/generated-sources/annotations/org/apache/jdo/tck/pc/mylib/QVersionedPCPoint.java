package org.apache.jdo.tck.pc.mylib;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QVersionedPCPoint extends PersistableExpressionImpl<VersionedPCPoint> implements PersistableExpression<VersionedPCPoint>
{
    public static final QVersionedPCPoint jdoCandidate = candidate("this");

    public static QVersionedPCPoint candidate(String name)
    {
        return new QVersionedPCPoint(null, name, 5);
    }

    public static QVersionedPCPoint candidate()
    {
        return jdoCandidate;
    }

    public static QVersionedPCPoint parameter(String name)
    {
        return new QVersionedPCPoint(VersionedPCPoint.class, name, ExpressionType.PARAMETER);
    }

    public static QVersionedPCPoint variable(String name)
    {
        return new QVersionedPCPoint(VersionedPCPoint.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> id;
    public final NumericExpression<Integer> x;
    public final NumericExpression<Integer> y;

    public QVersionedPCPoint(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.x = new NumericExpressionImpl<Integer>(this, "x");
        this.y = new NumericExpressionImpl<Integer>(this, "y");
    }

    public QVersionedPCPoint(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.x = new NumericExpressionImpl<Integer>(this, "x");
        this.y = new NumericExpressionImpl<Integer>(this, "y");
    }
}
