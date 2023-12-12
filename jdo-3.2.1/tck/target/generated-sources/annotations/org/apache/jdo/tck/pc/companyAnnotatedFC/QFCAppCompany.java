package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppCompany extends PersistableExpressionImpl<FCAppCompany> implements PersistableExpression<FCAppCompany>
{
    public static final QFCAppCompany jdoCandidate = candidate("this");

    public static QFCAppCompany candidate(String name)
    {
        return new QFCAppCompany(null, name, 5);
    }

    public static QFCAppCompany candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppCompany parameter(String name)
    {
        return new QFCAppCompany(FCAppCompany.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppCompany variable(String name)
    {
        return new QFCAppCompany(FCAppCompany.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> companyid;
    public final StringExpression name;
    public final DateTimeExpression founded;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppAddress address;
    public final CollectionExpression departments;

    public QFCAppCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.companyid = new NumericExpressionImpl<Long>(this, "companyid");
        this.name = new StringExpressionImpl(this, "name");
        this.founded = new DateTimeExpressionImpl(this, "founded");
        if (depth > 0)
        {
            this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppAddress(this, "address", depth-1);
        }
        else
        {
            this.address = null;
        }
        this.departments = new CollectionExpressionImpl(this, "departments");
    }

    public QFCAppCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.companyid = new NumericExpressionImpl<Long>(this, "companyid");
        this.name = new StringExpressionImpl(this, "name");
        this.founded = new DateTimeExpressionImpl(this, "founded");
        this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppAddress(this, "address", 5);
        this.departments = new CollectionExpressionImpl(this, "departments");
    }
}
