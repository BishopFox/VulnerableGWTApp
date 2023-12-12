package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSCompany extends PersistableExpressionImpl<FCDSCompany> implements PersistableExpression<FCDSCompany>
{
    public static final QFCDSCompany jdoCandidate = candidate("this");

    public static QFCDSCompany candidate(String name)
    {
        return new QFCDSCompany(null, name, 5);
    }

    public static QFCDSCompany candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSCompany parameter(String name)
    {
        return new QFCDSCompany(FCDSCompany.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSCompany variable(String name)
    {
        return new QFCDSCompany(FCDSCompany.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> companyid;
    public final StringExpression name;
    public final DateTimeExpression founded;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSAddress address;
    public final CollectionExpression departments;

    public QFCDSCompany(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.companyid = new NumericExpressionImpl<Long>(this, "companyid");
        this.name = new StringExpressionImpl(this, "name");
        this.founded = new DateTimeExpressionImpl(this, "founded");
        if (depth > 0)
        {
            this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSAddress(this, "address", depth-1);
        }
        else
        {
            this.address = null;
        }
        this.departments = new CollectionExpressionImpl(this, "departments");
    }

    public QFCDSCompany(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.companyid = new NumericExpressionImpl<Long>(this, "companyid");
        this.name = new StringExpressionImpl(this, "name");
        this.founded = new DateTimeExpressionImpl(this, "founded");
        this.address = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSAddress(this, "address", 5);
        this.departments = new CollectionExpressionImpl(this, "departments");
    }
}
