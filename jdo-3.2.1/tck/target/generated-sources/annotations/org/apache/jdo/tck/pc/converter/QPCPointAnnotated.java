package org.apache.jdo.tck.pc.converter;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCPointAnnotated extends PersistableExpressionImpl<PCPointAnnotated> implements PersistableExpression<PCPointAnnotated>
{
    public static final QPCPointAnnotated jdoCandidate = candidate("this");

    public static QPCPointAnnotated candidate(String name)
    {
        return new QPCPointAnnotated(null, name, 5);
    }

    public static QPCPointAnnotated candidate()
    {
        return jdoCandidate;
    }

    public static QPCPointAnnotated parameter(String name)
    {
        return new QPCPointAnnotated(PCPointAnnotated.class, name, ExpressionType.PARAMETER);
    }

    public static QPCPointAnnotated variable(String name)
    {
        return new QPCPointAnnotated(PCPointAnnotated.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> id;
    public final NumericExpression<Integer> x;
    public final NumericExpression<Integer> y;

    public QPCPointAnnotated(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.x = new NumericExpressionImpl<Integer>(this, "x");
        this.y = new NumericExpressionImpl<Integer>(this, "y");
    }

    public QPCPointAnnotated(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.x = new NumericExpressionImpl<Integer>(this, "x");
        this.y = new NumericExpressionImpl<Integer>(this, "y");
    }
}
