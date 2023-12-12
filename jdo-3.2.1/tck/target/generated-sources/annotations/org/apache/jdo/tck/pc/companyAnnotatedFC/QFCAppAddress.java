package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppAddress extends PersistableExpressionImpl<FCAppAddress> implements PersistableExpression<FCAppAddress>
{
    public static final QFCAppAddress jdoCandidate = candidate("this");

    public static QFCAppAddress candidate(String name)
    {
        return new QFCAppAddress(null, name, 5);
    }

    public static QFCAppAddress candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppAddress parameter(String name)
    {
        return new QFCAppAddress(FCAppAddress.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppAddress variable(String name)
    {
        return new QFCAppAddress(FCAppAddress.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> addrid;
    public final StringExpression street;
    public final StringExpression city;
    public final StringExpression state;
    public final StringExpression zipcode;
    public final StringExpression country;

    public QFCAppAddress(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.addrid = new NumericExpressionImpl<Long>(this, "addrid");
        this.street = new StringExpressionImpl(this, "street");
        this.city = new StringExpressionImpl(this, "city");
        this.state = new StringExpressionImpl(this, "state");
        this.zipcode = new StringExpressionImpl(this, "zipcode");
        this.country = new StringExpressionImpl(this, "country");
    }

    public QFCAppAddress(Class type, String name, ExpressionType exprType)
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
