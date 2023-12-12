package org.apache.jdo.tck.pc.query;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QNamedQueriesSample extends PersistableExpressionImpl<NamedQueriesSample> implements PersistableExpression<NamedQueriesSample>
{
    public static final QNamedQueriesSample jdoCandidate = candidate("this");

    public static QNamedQueriesSample candidate(String name)
    {
        return new QNamedQueriesSample(null, name, 5);
    }

    public static QNamedQueriesSample candidate()
    {
        return jdoCandidate;
    }

    public static QNamedQueriesSample parameter(String name)
    {
        return new QNamedQueriesSample(NamedQueriesSample.class, name, ExpressionType.PARAMETER);
    }

    public static QNamedQueriesSample variable(String name)
    {
        return new QNamedQueriesSample(NamedQueriesSample.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> id;
    public final StringExpression name;

    public QNamedQueriesSample(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.name = new StringExpressionImpl(this, "name");
    }

    public QNamedQueriesSample(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.id = new NumericExpressionImpl<Long>(this, "id");
        this.name = new StringExpressionImpl(this, "name");
    }
}
