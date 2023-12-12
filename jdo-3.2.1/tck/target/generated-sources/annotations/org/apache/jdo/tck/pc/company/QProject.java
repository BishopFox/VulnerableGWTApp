package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QProject extends PersistableExpressionImpl<Project> implements PersistableExpression<Project>
{
    public static final QProject jdoCandidate = candidate("this");

    public static QProject candidate(String name)
    {
        return new QProject(null, name, 5);
    }

    public static QProject candidate()
    {
        return jdoCandidate;
    }

    public static QProject parameter(String name)
    {
        return new QProject(Project.class, name, ExpressionType.PARAMETER);
    }

    public static QProject variable(String name)
    {
        return new QProject(Project.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> projid;
    public final StringExpression name;
    public final NumericExpression<java.math.BigDecimal> budget;
    public final CollectionExpression reviewers;
    public final CollectionExpression members;

    public QProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.projid = new NumericExpressionImpl<Long>(this, "projid");
        this.name = new StringExpressionImpl(this, "name");
        this.budget = new NumericExpressionImpl<java.math.BigDecimal>(this, "budget");
        this.reviewers = new CollectionExpressionImpl(this, "reviewers");
        this.members = new CollectionExpressionImpl(this, "members");
    }

    public QProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.projid = new NumericExpressionImpl<Long>(this, "projid");
        this.name = new StringExpressionImpl(this, "name");
        this.budget = new NumericExpressionImpl<java.math.BigDecimal>(this, "budget");
        this.reviewers = new CollectionExpressionImpl(this, "reviewers");
        this.members = new CollectionExpressionImpl(this, "members");
    }
}
