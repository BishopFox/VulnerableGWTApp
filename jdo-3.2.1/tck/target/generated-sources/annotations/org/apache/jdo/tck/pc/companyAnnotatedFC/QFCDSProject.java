package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSProject extends PersistableExpressionImpl<FCDSProject> implements PersistableExpression<FCDSProject>
{
    public static final QFCDSProject jdoCandidate = candidate("this");

    public static QFCDSProject candidate(String name)
    {
        return new QFCDSProject(null, name, 5);
    }

    public static QFCDSProject candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSProject parameter(String name)
    {
        return new QFCDSProject(FCDSProject.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSProject variable(String name)
    {
        return new QFCDSProject(FCDSProject.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> projid;
    public final StringExpression name;
    public final NumericExpression<java.math.BigDecimal> budget;
    public final CollectionExpression reviewers;
    public final CollectionExpression members;

    public QFCDSProject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.projid = new NumericExpressionImpl<Long>(this, "projid");
        this.name = new StringExpressionImpl(this, "name");
        this.budget = new NumericExpressionImpl<java.math.BigDecimal>(this, "budget");
        this.reviewers = new CollectionExpressionImpl(this, "reviewers");
        this.members = new CollectionExpressionImpl(this, "members");
    }

    public QFCDSProject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.projid = new NumericExpressionImpl<Long>(this, "projid");
        this.name = new StringExpressionImpl(this, "name");
        this.budget = new NumericExpressionImpl<java.math.BigDecimal>(this, "budget");
        this.reviewers = new CollectionExpressionImpl(this, "reviewers");
        this.members = new CollectionExpressionImpl(this, "members");
    }
}
