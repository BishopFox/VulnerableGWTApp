package org.apache.jdo.tck.pc.converter;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCRectAnnotated extends PersistableExpressionImpl<PCRectAnnotated> implements PersistableExpression<PCRectAnnotated>
{
    public static final QPCRectAnnotated jdoCandidate = candidate("this");

    public static QPCRectAnnotated candidate(String name)
    {
        return new QPCRectAnnotated(null, name, 5);
    }

    public static QPCRectAnnotated candidate()
    {
        return jdoCandidate;
    }

    public static QPCRectAnnotated parameter(String name)
    {
        return new QPCRectAnnotated(PCRectAnnotated.class, name, ExpressionType.PARAMETER);
    }

    public static QPCRectAnnotated variable(String name)
    {
        return new QPCRectAnnotated(PCRectAnnotated.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> id;
    public final ObjectExpression<org.apache.jdo.tck.pc.mylib.Point> upperLeft;
    public final ObjectExpression<org.apache.jdo.tck.pc.mylib.Point> lowerRight;

    public QPCRectAnnotated(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.upperLeft = new ObjectExpressionImpl<org.apache.jdo.tck.pc.mylib.Point>(this, "upperLeft");
        this.lowerRight = new ObjectExpressionImpl<org.apache.jdo.tck.pc.mylib.Point>(this, "lowerRight");
    }

    public QPCRectAnnotated(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.upperLeft = new ObjectExpressionImpl<org.apache.jdo.tck.pc.mylib.Point>(this, "upperLeft");
        this.lowerRight = new ObjectExpressionImpl<org.apache.jdo.tck.pc.mylib.Point>(this, "lowerRight");
    }
}
