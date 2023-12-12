package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCDSAddress extends PersistableExpressionImpl<PCDSAddress> implements PersistableExpression<PCDSAddress>
{
    public static final QPCDSAddress jdoCandidate = candidate("this");

    public static QPCDSAddress candidate(String name)
    {
        return new QPCDSAddress(null, name, 5);
    }

    public static QPCDSAddress candidate()
    {
        return jdoCandidate;
    }

    public static QPCDSAddress parameter(String name)
    {
        return new QPCDSAddress(PCDSAddress.class, name, ExpressionType.PARAMETER);
    }

    public static QPCDSAddress variable(String name)
    {
        return new QPCDSAddress(PCDSAddress.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> addrid;
    public final StringExpression street;
    public final StringExpression city;
    public final StringExpression state;
    public final StringExpression zipcode;
    public final StringExpression country;

    public QPCDSAddress(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.addrid = new NumericExpressionImpl<Long>(this, "addrid");
        this.street = new StringExpressionImpl(this, "street");
        this.city = new StringExpressionImpl(this, "city");
        this.state = new StringExpressionImpl(this, "state");
        this.zipcode = new StringExpressionImpl(this, "zipcode");
        this.country = new StringExpressionImpl(this, "country");
    }

    public QPCDSAddress(Class type, String name, ExpressionType exprType)
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
