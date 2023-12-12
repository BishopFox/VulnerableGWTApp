package org.apache.jdo.tck.pc.converter;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCPointPropAnnotated extends PersistableExpressionImpl<PCPointPropAnnotated> implements PersistableExpression<PCPointPropAnnotated>
{
    public static final QPCPointPropAnnotated jdoCandidate = candidate("this");

    public static QPCPointPropAnnotated candidate(String name)
    {
        return new QPCPointPropAnnotated(null, name, 5);
    }

    public static QPCPointPropAnnotated candidate()
    {
        return jdoCandidate;
    }

    public static QPCPointPropAnnotated parameter(String name)
    {
        return new QPCPointPropAnnotated(PCPointPropAnnotated.class, name, ExpressionType.PARAMETER);
    }

    public static QPCPointPropAnnotated variable(String name)
    {
        return new QPCPointPropAnnotated(PCPointPropAnnotated.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> id;
    public final NumericExpression<Integer> x;
    public final NumericExpression<Integer> y;

    public QPCPointPropAnnotated(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.x = new NumericExpressionImpl<Integer>(this, "x");
        this.y = new NumericExpressionImpl<Integer>(this, "y");
    }

    public QPCPointPropAnnotated(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.x = new NumericExpressionImpl<Integer>(this, "x");
        this.y = new NumericExpressionImpl<Integer>(this, "y");
    }
}
