package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSAddress extends PersistableExpressionImpl<FCDSAddress> implements PersistableExpression<FCDSAddress>
{
    public static final QFCDSAddress jdoCandidate = candidate("this");

    public static QFCDSAddress candidate(String name)
    {
        return new QFCDSAddress(null, name, 5);
    }

    public static QFCDSAddress candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSAddress parameter(String name)
    {
        return new QFCDSAddress(FCDSAddress.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSAddress variable(String name)
    {
        return new QFCDSAddress(FCDSAddress.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> addrid;
    public final StringExpression street;
    public final StringExpression city;
    public final StringExpression state;
    public final StringExpression zipcode;
    public final StringExpression country;

    public QFCDSAddress(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.addrid = new NumericExpressionImpl<Long>(this, "addrid");
        this.street = new StringExpressionImpl(this, "street");
        this.city = new StringExpressionImpl(this, "city");
        this.state = new StringExpressionImpl(this, "state");
        this.zipcode = new StringExpressionImpl(this, "zipcode");
        this.country = new StringExpressionImpl(this, "country");
    }

    public QFCDSAddress(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.addrid = new NumericExpressionImpl<Long>(this, "addrid");
        this.street = new StringExpressionImpl(this, "street");
        this.city = new StringExpressionImpl(this, "city");
        this.state = new StringExpressionImpl(this, "state");
        this.zipcode = new StringExpressionImpl(this, "zipcode");
        this.country = new StringExpressionImpl(this, "country");
    }
}
