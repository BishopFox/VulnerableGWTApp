package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppProject extends PersistableExpressionImpl<FCAppProject> implements PersistableExpression<FCAppProject>
{
    public static final QFCAppProject jdoCandidate = candidate("this");

    public static QFCAppProject candidate(String name)
    {
        return new QFCAppProject(null, name, 5);
    }

    public static QFCAppProject candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppProject parameter(String name)
    {
        return new QFCAppProject(FCAppProject.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppProject variable(String name)
    {
        return new QFCAppProject(FCAppProject.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> projid;
    public final StringExpression name;
    public final NumericExpression<java.math.BigDecimal> budget;
    public final CollectionExpression reviewers;
    public final CollectionExpression members;

    public QFCAppProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.projid = new NumericExpressionImpl<Long>(this, "projid");
        this.name = new StringExpressionImpl(this, "name");
        this.budget = new NumericExpressionImpl<java.math.BigDecimal>(this, "budget");
        this.reviewers = new CollectionExpressionImpl(this, "reviewers");
        this.members = new CollectionExpressionImpl(this, "members");
    }

    public QFCAppProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.projid = new NumericExpressionImpl<Long>(this, "projid");
        this.name = new StringExpressionImpl(this, "name");
        this.budget = new NumericExpressionImpl<java.math.BigDecimal>(this, "budget");
        this.reviewers = new CollectionExpressionImpl(this, "reviewers");
        this.members = new CollectionExpressionImpl(this, "members");
    }
}
