package org.apache.jdo.tck.pc.companyAnnotatedPC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPCAppAddress extends PersistableExpressionImpl<PCAppAddress> implements PersistableExpression<PCAppAddress>
{
    public static final QPCAppAddress jdoCandidate = candidate("this");

    public static QPCAppAddress candidate(String name)
    {
        return new QPCAppAddress(null, name, 5);
    }

    public static QPCAppAddress candidate()
    {
        return jdoCandidate;
    }

    public static QPCAppAddress parameter(String name)
    {
        return new QPCAppAddress(PCAppAddress.class, name, ExpressionType.PARAMETER);
    }

    public static QPCAppAddress variable(String name)
    {
        return new QPCAppAddress(PCAppAddress.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> addrid;
    public final StringExpression street;
    public final StringExpression city;
    public final StringExpression state;
    public final StringExpression zipcode;
    public final StringExpression country;

    public QPCAppAddress(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.addrid = new NumericExpressionImpl<Long>(this, "addrid");
        this.street = new StringExpressionImpl(this, "street");
        this.city = new StringExpressionImpl(this, "city");
        this.state = new StringExpressionImpl(this, "state");
        this.zipcode = new StringExpressionImpl(this, "zipcode");
        this.country = new StringExpressionImpl(this, "country");
    }

    public QPCAppAddress(Class type, String name, ExpressionType exprType)
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
